# -*- coding: utf-8 -*-
"""
Created on Sat Mar 13 16:33:02 2021

@author: ADMIN
"""
from time import time

def insertionSort(arr):
    start_time = time()
    for i in range(1, len(arr)):
        key = arr[i]
        
        j = i-1
        while j>=0 and key<arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key
    elapsed_time = time() - start_time
    print(f"Tiempo de ejecución: {elapsed_time} seconds")
#main

arr = [38,7,5,6,9,12,21]
insertionSort(arr)
print("The sorted array is: ")
for i in range(len(arr)):
    print(arr[i])
