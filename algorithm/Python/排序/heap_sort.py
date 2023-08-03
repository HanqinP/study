from typing import List

# 递归版
def heapify_cursion(arr:List, n: int, i: int):
    leftchild = i*2+1
    rightchild = i*2+2
    largest = i

    if leftchild<n and arr[leftchild]>arr[largest]:
        largest = leftchild
    if rightchild<n and arr[rightchild]>arr[largest]:
        largest = rightchild

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify_cursion(arr, n, largest)

def heapify_no_cursion(ls: List, n: int, i: int):
    leftchild = i*2+1
    rightchild = i*2+2
    largest = i
    while i <= n//2-1:
        if leftchild < n and ls[leftchild] > ls[largest]:
            largest = leftchild
        if rightchild < n and ls[rightchild] > ls[largest]:
            largest = rightchild

        if largest != i:
            ls[largest], ls[i] = ls[i], ls[largest]

        i = largest
        leftchild = i*2+1
        rightchild = i*2+2

def doheapsort(arr:List):
    """
    this is the heapsort function, is will modify arr directly.

    Parameters:
        arr(List): The list need to be sorted

    Return:
        None
    """
    print("start heap sort...")
    n = len(arr)
    # 生成大顶堆
    print("生成大顶堆...")
    for i in range(n//2-1, -1, -1):
        #非递归
        heapify_no_cursion(arr, n, i)
        #递归
        #heapify_cursion(arr, n, i)

    # 排序
    print("排序...")
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        #非递归
        heapify_no_cursion(arr, i, 0)
        #递归
        #heapify_cursion(arr, n, i)
