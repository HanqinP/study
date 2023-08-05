from heap_sort import doheapsort
from bubble_sort import dobubblesort
from merge_sort import domergesort
from insertion_sort import doinsertionsort
from quicksort import doquicksort

#程序开始
ls = [1,4,3,2,65,23]
print('原序列：', ls)
ls_copy = ls.copy()

"""
堆排序
"""
#doheapsort(ls_copy)

"""
冒泡排序
"""
#dobubblesort(ls_copy)

"""
归并排序
"""
#domergesort(ls_copy)


"""
插入排序
"""
#doinsertionsort(ls_copy)

"""
快速排序
"""
doquicksort(ls_copy)


print(ls_copy)

print("Finish")

