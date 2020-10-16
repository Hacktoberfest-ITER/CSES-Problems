# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number
# https://cses.fi/problemset/task/1083/

n= int(input())
numlist=list(map(int,input().strip().split()))
print(n*(n+1)//2-sum(numlist))

# author: deadcoder
# https://cses.fi/user/32336