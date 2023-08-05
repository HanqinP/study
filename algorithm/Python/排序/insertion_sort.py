from typing import List

def doinsertionsort(ls: List):
    n = len(ls)
    for i in range(1, n):
        j = i-1
        key = ls[i]
        while j>=0 and ls[j] > key:
            ls[j+1] = ls[j]
            j-=1
        ls[j+1] = key



