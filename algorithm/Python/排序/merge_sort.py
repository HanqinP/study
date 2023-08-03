from typing import List


def domergesort(ls: List):
    print("start merge sort...")
    n = len(ls)
    mergesort(ls, 0, n-1)


def mergesort(ls:List, left:int, right:int):
    #递归终止条件，当拆分的数组只有一个元素时结束
    if left==right:
        return 

    #把当前范围数组对半拆分为两部分
    mid = left + (right-left)//2
    mergesort(ls, left, mid)
    mergesort(ls, mid+1, right)
    
    #合并之前分开的两部分数组，将他们排序后
    templeft = []
    tempright = []
    for i in range(left, mid+1):
        templeft.append(ls[i])
    for j in range(mid+1, right+1):
        tempright.append(ls[j])

    m = 0
    n = 0
    k = left

    while m<len(templeft) and n<len(tempright):
        if templeft[m] <= tempright[n]:
            ls[k] = templeft[m]
            m+=1
        else:
            ls[k] = tempright[n]
            n+=1
        k+=1

    while m<len(templeft):
        ls[k] = templeft[m]
        m+=1
        k+=1

    while n<len(tempright):
        ls[k] = tempright[n]
        n+=1
        k+=1
