# -*- coding: utf-8 -*-
"""
Created on Tue Apr 13 16:42:58 2021

@author: ADMIN
"""

import os
import numpy as np

class Node: 
    probability = 0.0
    symbol = ""
    encoding = ""
    visited = False
    parent = -1
    
class Huffman:
    Tree = None
    Root = None
    Nodes = []
    probs = {}
    dictEncoder = {}
    
    #metodos 
    
    def __init__(self, symbols):
        self.initNodes(symbols)
        self.buildTree()
        self.buildDictionary
    
    def initNodes(self, probs):
        for symbol in probs:
            node = Node()
            node.symbol = symbol
            node.probability = probs[symbol]
            node.visited = False
            self.Nodes.append(node)
            self.probs[symbol]=probs[symbol]
            
    def buildTree(self):
        indexMin1 = self.getNodeWithMiniumProb()
        indexMin2 = self.getNodeWithMiniumProb()
        
        while indexMin1 != -1 and indexMin2 != -1 :
            node = Node()
            node.symbol = "."
            node.encoding = ""
            prob1 = self.Nodes[indexMin1].probability
            prob2 = self.Nodes[indexMin2].probability
            node.probability = prob1 + prob2
            node.visited = False
            node.parent = -1
            self.Nodes.append(node)
            self.Nodes[indexMin1].parent = len(self.Nodes) - 1
            self.Nodes[indexMin2].parent = len(self.Nodes) - 1
            
            if prob1 >= prob2:
                self.Nodes[indexMin1].encoding = "0"
                self.Nodes[indexMin2].encoding = "1"
            else:
                self.Nodes[indexMin1].encoding = "1"
                self.Nodes[indexMin2].encoding = "0"
                
            indexMin1 = self.getNodeWithMiniumProb()
            indexMin2 = self.getNodeWithMiniumProb()
            
    def getNodeWithMiniumProb(self):
        minProb = 1.0
        indexMin = -1
        
        for index in range(0, len(self.Nodes)):
            if(self.Nodes[index].probability < minProb and (not self.Nodes[index].visited)):
                minProb = self.Nodes[index].probability
                indexMin = index
        if indexMin != -1:
            self.Nodes[indexMin].visited = True
        return indexMin
    
    def showSymbolEncoding(self, symbol): #Designar codigo binario
        found = False
        index = 0
        encoding = ""
        
        for i in range(0, len(self.Nodes)):
            if self.Nodes[i].symbol == symbol:
                found = True
                index = i
                break
        
        if found:
            while index != -1:
                encoding = "%s%s" % (self.Nodes[index].encoding, encoding)
                index = self.Nodes[index].parent
        else:
            encoding = "simbolo desconocido"
        return encoding
    
    def buildDictionary(self): #guardamos simbolos con su digito binario
        for symbol in self.probs:
            encoding = self.showSymbolEncoding(symbol)
            self.dictEncoder[symbol] = encoding
            
    def encode(self, plain): #agrupamos los codigos binarios
        encoded = ""
        for symbol in plain:
            encoded = "%s%s" % (encoded, self.dictEncoder[symbol])
        return encoded
    
    """Aquí se descomprime"""
    
    def decode(self, encoded):
        index = 0
        decoded = ""
        
        while index < len(encoded):
            found = False
            aux = encoded[index:]
            
            for symbol in self.probs:
                if aux.startsWith(self.dictEncoder[symbol]):
                    decoded = "%s%s" % (decoded, symbol)
                    index = index + len(self.dictEncoder[symbol])
                    break
        return decoded
    
lista_ganadoS = os.listdir("archivosCSV/ganado_sano_c")

        
for nombre in lista_ganadoS: #Recorrido de archivos complejidad O(1) ó O(n)
        archivo = open("archivosCSV/ganado_sano_c/"+nombre, "r")
        mensaje=archivo.read()
        simbolos=''
        probabilidad=[]
        msm = mensaje
        for i in mensaje:
            if i in msm:
                print (i,"=",int(msm.count(i)))
                simbolos+=i
                probabilidad.append(float(float(msm.count(i))/float(len(mensaje))))
                msm=msm.replace(i,'')
                
        symbols=dict(zip(simbolos, probabilidad)) 
        compresion = Huffman(symbols)
        encoded = compresion.encode(mensaje)
        file = open(f"codificacion/{nombre}.txt", "w")
        file.write(encoded)
        file.close()
        archivo.close()
        
        