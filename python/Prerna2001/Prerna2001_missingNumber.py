# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
# https://cses.fi/problemset/task/1083

def getMissing(ar,n):
    s_n = n*(n+1) / 2
    s_a = sum(ar)
    return int(s_n - s_a)

n = int(input())
lst = [int(s) for s in input().strip().split()]
print(getMissing(lst, n))

# author : PrernaBabber
# https://cses.fi/user/32267