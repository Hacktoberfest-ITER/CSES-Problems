# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
# Question Link: https://cses.fi/problemset/task/1083/
# Author : jyotij
# profile :  https://cses.fi/user/32333
# solution : https://cses.fi/problemset/result/1134619/
n = int(input())
array=map(int,input().split())
print(int(((n*(n+1))/2)-sum(array)))
