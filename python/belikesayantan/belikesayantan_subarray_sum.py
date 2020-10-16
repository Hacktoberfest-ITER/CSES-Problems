# author: https://cses.fi/user/32392
# @belikesayantan


'''
Subarray Sums I : https://cses.fi/problemset/task/1660/
Problem:
    Given an array of n positive integers, your task is to count the number of subarrays having sum x.
'''
from collections import defaultdict

_, x = (int(x) for x in input().split())
arr = [int(x) for x in input().split()]

count, curr_sum = 0, 0
sums_count = defaultdict(int)

for i in arr:
    curr_sum += i
    if curr_sum == x:
        count += 1
    if curr_sum - x in sums_count:
        count += sums_count[curr_sum - x]
    sums_count[curr_sum] += 1

print(count)
