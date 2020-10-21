# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1083/
# QUESTION
# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
n = int(input())
n1array=map(int,input().split())
print(int(((n*(n+1))/2)-sum(n1array)))