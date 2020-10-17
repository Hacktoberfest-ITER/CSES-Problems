# Author: Sandip Nayak
# You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
# On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
# https://cses.fi/problemset/task/1094
# userId: https://cses.fi/user/34086

num = int(input())
arr = list(map(int,input().strip().split()))
total=0
m=arr[0]
for i in arr:
    total+=max(0,m-i)
    m=max(m,i)
print(total)

