# You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
#On each turn, you may increase the value of any element by one. What is the minimum number of turns required?
# Question link : https://cses.fi/problemset/task/1094
# Author : jyotij
# profile :  https://cses.fi/user/32333
# solution : https://cses.fi/problemset/result/1137543/

n = int(input())
a = list(map(int,input().strip().split()))
total=0
m=a[0]
for i in a:
    total+=max(0,m-i)
    m=max(m,i)
print(total)