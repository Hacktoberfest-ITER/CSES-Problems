# author: https://cses.fi/user/32392
# @belikesayantan

''' Distinct Numbers - https://cses.fi/problemset/task/1621
You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
'''
from typing import List
from collections import Counter

def distinct(n: int, arr: List[int]):
    """Distinct Numbers in a List
    Input:
        n: length of the array
        arr: List of integers
    Output:
        unique: Number of unique values in the list
    """
    unique = len(Counter(arr).keys())
    return unique

if __name__ == "__main__":
    print(distinct(int(input()), [int(x) for x in input().split()]))