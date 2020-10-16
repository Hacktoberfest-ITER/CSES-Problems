# Maximum Subarray Sum : Given an array of n integers, your task is to find the maximum sum of values in a contiguous, nonempty subarray.
# https://cses.fi/problemset/task/1643/

n = int(input())
array = [int(x) for x in input().split()]
Sub=array[0]
Sum=0
for i in array:
    if Sum<0 :
        Sum=0
    Sum+=i
    Sub=max(Sum,Sub)
print(Sub)

# author: saniya3
# https://cses.fi/user/32262