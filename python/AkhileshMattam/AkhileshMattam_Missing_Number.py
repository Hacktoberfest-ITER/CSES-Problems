# Time limit: 1.00 s Memory limit: 512 MB
# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
# program link:https://cses.fi/problemset/task/1083/
# Author:AkhileshMattam
# profile link:https://cses.fi/user/32346
n =  int(input())
l = list(map(int,input().split()))[:n-1]
t = 0
for j in range(n-1):
    t+=l[j]
for i in range(1,(n+1)):
    t-=i
print(abs(t))
    
    