from typing import List

def quicksort(ls: List, start:int, end: int):
    if start >= end:
        return
    left = start
    right = end
    key = ls[left]

    while left < right:

        while right > left and ls[right] >= key:
            right-=1
        if left < right:      
            ls[left] = ls[right]
        while left < right and ls[left] <= key:
            left+=1
        if left < right:    
            ls[right] = ls[left]

    ls[left] = key

    quicksort(ls, start, left-1)
    quicksort(ls, left+1, end)

def doquicksort(ls: List):
    print("start quick sort...")
    n = len(ls)
    quicksort(ls, 0, n-1)
