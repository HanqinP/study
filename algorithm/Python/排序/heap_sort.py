from typing import List

# 递归版
def heapify(arr:List, n: int, i: int):
    leftchild = i*2+1
    rightchild = i*2+2
    largest = i

    if leftchild<n and arr[leftchild]>arr[largest]:
        largest = leftchild
    if rightchild<n and arr[rightchild]>arr[largest]:
        largest = rightchild

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)

def doheapsort(arr:List):
    print("开始堆排序...")
    n = len(ls)
    # 生成大顶堆
    print("生成大顶堆...")
    for i in range(n//2-1, -1, -1):
        heapify(ls, n, i)



    # 排序
    print("排序...")
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)

ls = [1,4,3,2,65,23]

doheapsort(ls)


print(ls)
print("Finish")