# Icreasing Array:You are given an array of n integers.You want to modify the array so that it is increasing.
# On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
# https://cses.fi/problemset/task/1094/

n = int(input())
l = list(map(int,input().split(' '))) 
c=0
for i in range(1,n):
    if l[i-1]>l[i]:
        c+=(l[i-1]-l[i])
        l[i]=l[i-1]     
print(c)

# author: saniya3
# https://cses.fi/user/32262

        