# You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
# On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
# program link:https://cses.fi/problemset/task/1094
# author:AkhileshMattam
# profile link:https://cses.fi/user/32346
n = int(input())
l1 = list(map(int,input().split()))[:n]
t = 0
for i in range(1,n):
    if l1[i-1]>l1[i]:
        t+=(l1[i-1]-l1[i])
        l1[i]=l1[i-1]
print(t)
