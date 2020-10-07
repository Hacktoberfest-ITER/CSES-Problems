# Author: Ankita Satapathy
# find the maximum sum of values in a contiguous, nonempty subarray.
# https://cses.fi/problemset/task/1643/
# userId: https://cses.fi/user/32881

n = int(input())
array = [int(x) for x in input().split()]
curr, maxSum = array[0], array[0]
for i in range(1, len(array)):
    curr = max(curr + array[i], array[i])
    maxSum= max(maxSum, curr)
print(maxSum)
