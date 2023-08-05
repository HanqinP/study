from typing import List
import random

def quicksort(arr, start, end, flag):
    if start > end:
        return

    left = start
    right = end
    key = arr[left]

    while left < right:
        if flag:
            while right > left and arr[right] <= key:
                right -= 1
            if right > left:
                arr[left] = arr[right]

            while left < right and arr[left] >= key:
                left += 1
            if left < right:
                arr[right] = arr[left]
        else:
            while right > left and arr[right] >= key:
                right -= 1
            if right > left:
                arr[left] = arr[right]

            while left < right and arr[left] <= key:
                left += 1
            if left < right:
                arr[right] = arr[left]

        
    arr[left] = key

    quicksort(arr, start, left-1, flag)
    quicksort(arr, left+1, end, flag)


n = 161
ls = []
for i in range(161):
    num = random.randint(1,900)
    ls.append(num)
0
flag = int(input())
quicksort(ls, 0, int(n)-1, flag)
for i in ls:
    print(i, end=' ')



    