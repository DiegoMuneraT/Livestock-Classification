"""
@author Diego Munera - Maria Velasquez

Esta versión del código únicamente lee los archivos con extensión .csv en las carpetas
predestinadas para ellos.

El control de la visualización de cada archivo lo hace el usuario. Esto debido a que
al ser tantos archivos, la vista inmediata de todos podría colapsar la funcionalidad
del programa.
"""
import os
import pandas as pd
#Filtro para redireccionarse a las carpetas
diferenciador = int(input('¿Qué carpeta desea manejar? Vacas Sanas (1) Vacas Enfermas (0) : '))

#Parametro igual a 1, se procede con la carpeta de vacas sanas
if(diferenciador==1):
    #Se dirige al path especificado y lista los elementos de tal carpeta
    path = 'C:/Users/ADMIN/Desktop/ST0245-Eafit/proyecto/datasets/archivosCSV/ganado sano CSVs'
    directorios = os.listdir(path)
    #Se recorre la carpeta hasta que el usuario desee o esta se quede sin elementos
    for file in directorios:
        centinela = input('¿Pasar al siguiente archivo? Y/N: ')
        if(centinela=='Y' or centinela=='y'):
            Archivo = pd.read_csv(f'C:/Users/ADMIN/Desktop/ST0245-Eafit/proyecto/datasets/archivosCSV/ganado sano CSVs/{file}',sep=',')
        elif(centinela=='N' or centinela=='n'):
            mostrar = input('¿Imprimir? Y/N = ')
            if(mostrar=='Y' or mostrar=='y'):
                print(Archivo)
            elif(mostrar=='N' or mostrar=='n'):
                print('Programa finalizado exitosamente')
                break
            else:
                print('Parametro no establecido en  los lÍmites')
                print('Shutting down program')
                break
        else:
            print('Parametro no establecido en  los lÍmites')
            print('Shutting down program')
            break
        
#Parametro igual a 0, se procede con la carpeta de vacas enfermas     
elif(diferenciador==0):
    #Se dirige al path especificado y lista los elementos de tal carpeta
    path = 'C:/Users/ADMIN/Desktop/ST0245-Eafit/proyecto/datasets/archivosCSV/ganado enfermo CSVs'
    directorios = os.listdir(path)
    #Se recorre la carpeta hasta que el usuario desee o esta se quede sin elementos
    for file in directorios:
        centinela = input('¿Pasar al siguiente archivo? Y/N: ')
        if(centinela=='Y' or centinela=='y'):
            Archivo = pd.read_csv(f'C:/Users/ADMIN/Desktop/ST0245-Eafit/proyecto/datasets/archivosCSV/ganado enfermo CSVs/{file}',sep=',')
        elif(centinela=='N' or centinela=='n'):
            mostrar = input('¿Imprimir? Y/N: ')
            if(mostrar=='Y' or mostrar=='y'):
                print(Archivo)
            elif(mostrar=='N' or mostrar=='n'):
                print('Programa finalizado exitosamente')
                break
            else:
                print('Parametro no establecido en  los limites')
                print('Shutting down program')
                break
        else:
            print('Parametro no establecido en  los lÍmites')
            print('Shutting down program')
            break
        
else:
    print('Parametro recibido no establecido en los limites')
    print('Finalizando programa')