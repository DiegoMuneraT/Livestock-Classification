import os
import cv2
from matplotlib import pyplot as plt
from time import time
import codification

#   Codificar
start_time1 = time()
ganadoSano = os.listdir("imagenes/ganado sano grises")
for nombre in ganadoSano:  # M
    archivo = open('imagenes/ganado sano grises/' + nombre, 'r')  # C1
    mensaje = str(cv2.imread('imagenes/ganado sano grises/' + nombre))  # C2
    simbolos = ''  # C3
    probabilidad = []  # C4
    msj = mensaje  # C5
    for i in mensaje:  # M*N*L
        if i in msj:  # C6
            print(i, "=", int(msj.count(i)))  # C7
            simbolos += i  # N/L
            probabilidad.append(float(float(msj.count(i)) / float(len(mensaje))))  # C8
            msj = msj.replace(i, '')  # C9

    symbols = dict(zip(simbolos, probabilidad))  # T(1)
    compresion = codification.Huffman(symbols)  # T(n) This method makes the data compression / Codification complex.

    for symbol in symbols:  # C10*L
        print("Simbol: %s; Code: %s" % (symbol, compresion.showSymbolEncoding(symbol)))  # C11
    encoded = compresion.encode(mensaje)  # T(1)
    file = open(f"codificacion vacas sanas/{nombre}.txt", "w")  # T(1)
    file.write(encoded)  # T(1)
    file.close()  # T(1)
    archivo.close()  # T(1)

    # N: matrix size | M: images | L: compressed chain length
    # __________________________________________________________________________________
    # T(n) = M + C1 + C2 +  C3 + C4 + C5 + M*N*L + C6 + C7 + N/L + C8 + C9 + C10*L + C11
    # T(n) = l*(c^11 + m*n) + n/l + m
    # O(n) = l*(c^11 + m*n) + n/l + m  | O definition
    # O(n) = l*(m*n) + n/l + m  | sum rule
    # O(n) = l*(m*n)  | product rule
    # O(n) = (l*(m*2n))^2  | product of doing this process 2 times with both folders (sickCow, healthyCow)
    # -----------------------------------------------------------------------------------
    # In the worst case we can find an image with a huge quantity of pixels, in fact, a huge N input.
    # Talking about huffman complexity, first we count the number of occurrences for each input byte, then
    # we sort it and build the output encoding.

    # Decodificar
    ganadoSanoCodificado = os.listdir("codificacion vacas sanas")
    for name in ganadoSanoCodificado:
        encode = open("codificacion vacas sanas/" + name, 'r')
        texto = encode.read()
        decoded = codification.Huffman.decode(compresion, texto)
        file = open(f"decodificacion vacas sanas/{name}.csv", "w")
        file.write(decoded)  # T(1)
        file.close()  # T(1)
        encode.close()  # T(1)
elapsed_time1 = time() - start_time1

start_time2 = time()
# Codificar
ganadoEnfermo = os.listdir("imagenes/ganado enfermo grises")
for nombre in ganadoEnfermo:
    archivo = open('imagenes/ganado enfermo grises/' + nombre, 'r')
    mensaje = str(cv2.imread('imagenes/ganado enfermo grises/' + nombre))
    simbolos = ''
    probabilidad = []
    msj = mensaje
    for i in mensaje:
        if i in msj:
            print(i, "=", int(msj.count(i)))
            simbolos += i
            probabilidad.append(float(float(msj.count(i)) / float(len(mensaje))))
            msj = msj.replace(i, '')

    symbols = dict(zip(simbolos, probabilidad))
    compresion = codification.Huffman(symbols)

    for symbol in symbols:
        print("Simbol: %s; Code: %s" % (symbol, compresion.showSymbolEncoding(symbol)))
    encoded = compresion.encode(mensaje)
    file = open(f"codificacion vacas enfermas/{nombre}.txt", "w")
    file.write(encoded)
    file.close()
    archivo.close()

    # Decodificar
    ganadoEnfermoCodificado = os.listdir("codificacion vacas enfermas")
    for name in ganadoEnfermoCodificado:
        encode = open("codificacion vacas enfermas/" + name, 'r')
        texto = encode.read()
        decoded = codification.Huffman.decode(compresion, texto)
        file = open(f"decodificacion vacas enfermas/{name}.csv", "w")
        file.write(decoded)
        file.close()
        encode.close()
elapsed_time2 = time() - start_time2

xS= 372
xE = 656
print(f"Tiempo de ejecución compresión y descompresión ganado sano: {elapsed_time1} seconds")
print("Gráfica: ")
plt.plot(xS,elapsed_time1)
plt.show()
print(f"Tiempo de ejecución compresión y descompresión ganado enfermo: {elapsed_time2} seconds")
print("Gráfica: ")
plt.plot(xE,elapsed_time2)
plt.show()