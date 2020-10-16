# Author: Sandip Nayak
#You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
#https://cses.fi/problemset/task/1083
#userId: https://cses.fi/user/34086

num = int(input())
array=map(int,input().split())
print(int(((num*(num+1))/2)-sum(array)))