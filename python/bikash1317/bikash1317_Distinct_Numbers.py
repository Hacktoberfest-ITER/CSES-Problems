# User ID :  https://cses.fi/user/32480

# Problem Number : https://cses.fi/problemset/task/1621/

# Author : bikash1317

# Questions : 
# You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

# Input

# The first input line has an integer n: the number of values.

# The second line has n integers x1,x2,…,xn.



n = int(input())

ele = input()
e = ele.split()

for i in range(0, len(e)):
    e[i] = int(e[i])


e.sort()
count = 0
flag = 0
for i in range(n):
    if(i < n-1 and e[i] == e[i+1]):
        i = i + 1
    else:
        count = count + 1

print(count)
