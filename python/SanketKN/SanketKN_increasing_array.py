#increasing array
#https://cses.fi/problemset/task/1094/
#You are given an array of n integers. You want to modify the array so that it is increasing,
#i.e., every element is at least as large as the previous element.
#author : SanketKN
#csis id:https://cses.fi/user/33432

x = int(input())
n = list(map(int,input().split()))[:(x-1)]
k = 0

for i in range(0, x-1):
    if n[i] > n[i+1]:      
        k += (n[i]-n[i+1])
        n[i+1] = n[i]
print(k)   
