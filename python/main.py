# python main function
"""
if run in this file, __name__ = __main__
if run in other's file, __name__ = main(the name of this file)
"""

import PowerSeries
from typing import List

print(__name__)


def longestCommonPrefix(strs: List[str]) -> str:
    prefix = strs[0]
    if len(strs) <= 0:
        return ''
    for index in range(1,len(strs)):
        
        minLength = min(len(prefix),len(strs[index]))
        for j in range(minLength):
            if prefix[j] != strs[index][j] :
                prefix = prefix[:j]
                break
        prefix = prefix if len(prefix) < len(strs[index]) else strs[index]
        
    return prefix






def main():
    strs = ["ab","a"]
    print(longestCommonPrefix(strs))

if __name__ == "__main__":
    main()