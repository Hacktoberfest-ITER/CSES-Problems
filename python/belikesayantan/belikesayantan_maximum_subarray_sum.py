# author: https://cses.fi/user/32392
# @belikesayantan

'''Sorting and Searching - Maximum Subarray Sum'''
n = int(input())
arr = [int(x) for x in input().split()]

curr, best = arr[0], arr[0]
for i in range(1, len(arr)):
    curr = max(curr + arr[i], arr[i])
    best = max(best, curr)

print(best)