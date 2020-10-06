# Maximum Subarray Sum : Given an array of n integers, your task is to find the maximum sum of values in a contiguous, nonempty subarray.
# https://cses.fi/problemset/task/1643/

n = int(input())
arr = [int(x) for x in input().split()]
maxSub = arr[0]
curSum = 0
for n in arr:
    if curSum < 0 :
        curSum = 0
    curSum +=n
    maxSub = max(curSum,maxSub)
print(maxSub)

# author : nishantc7
# profile : https://cses.fi/user/32680