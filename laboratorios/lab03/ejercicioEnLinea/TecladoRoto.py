# -*- coding: utf-8 -*-
"""
Created on Sun Mar 28 21:41:04 2021

@author: ADMIN
"""

from collections import deque

class Node():
    
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
        
    def __repr__(self):
        return self.data
    
class LinkedList():
    def __init__(self):
        self.head = None
        
    def __repr__(self):
        node = self.head
        nodes = []
        while node is not None:
            nodes.append(node.data)
            node = node.next
while True:
    try:
        entrada = input()
    except EOFError:
        break
    ll = LinkedList()
    nod = 0
    for c in entrada:
        if c == '[':
            pos = 0
        elif c == ']':
            pos = ll.size
        else:
            ll.append(c,pos)
            pos +=1
    print(ll)
        
        
        
        
    