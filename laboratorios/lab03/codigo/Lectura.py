# -*- coding: utf-8 -*-
"""
Created on Sun Mar 28 18:23:14 2021

@author: Diego Múnera, Maria Antonia
"""
import pandas as pd

dataArcos = pd.read_csv('Arcos.csv') 
dataArcos.columns = ['ID','ID1','Distancia','Nombre']
dirArcos = dataArcos.to_dict('list')
dataArcos = pd.read_csv('Arcos.csv')
print(dataArcos.head())

diccArcos = {}
for i in range(len(dataArcos['ID'])):
    diccArcos[(dataArcos.iloc[i]['ID'],dataArcos.iloc[i]['ID1'])] = diccArcos[i]

print("El diccionario de los arcos es:")
print(diccArcos)

dataVertices = pd.read_csv('Vertices.csv')
dataVertices.columns = ['ID','CoordenadaX','CoordenadaY','Nombre']
dirVertices = dataVertices.to_dict('dict')
print(dirVertices)
diccVert = {}
for i in dataVertices["ID"]:
    diccVert[(dataVertices.iloc[i]['ID'])] = diccVert[i]
print("El diccionario de los vertices es:")
print(diccVert)
