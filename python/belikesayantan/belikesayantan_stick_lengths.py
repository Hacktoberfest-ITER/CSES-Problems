# author: https://cses.fi/user/32392
# @belikesayantan

''' Stick Lengths - https://cses.fi/problemset/task/1074
There are n sticks with some lengths. Your task is to modify the sticks so that each stick has the same length.

You can either lengthen and shorten each stick. Both operations cost x where x is the difference between the new and original length.

What is the minimum total cost?
'''
from typing import List


def sticklengths(n: int, arr: List[int]) -> int:
    mid = n // 2
    return sum(arr[mid + n % 2:]) - sum(arr[: mid])


if __name__ == "__main__":
    print(sticklengths(int(input()), sorted([int(x) for x in input().split()])))