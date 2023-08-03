from typing import List


def dobubblesort(ls: List):
    """
    bubble sort
    
    parameters:
        ls(List): the list which need to be sorted, it will modify ls directly

    return: 
        None
    """
    print("start bubble sort...")
    n = len(ls)
    for i in range(n-1):
        for j in range(n-1-i):
            if ls[j] > ls[j+1]:
                ls[j], ls[j+1] = ls[j+1], ls[j]
