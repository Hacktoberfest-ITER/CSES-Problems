#You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
# program link:https://cses.fi/problemset/task/1621
# author:AkhileshMattam
# profile link:https://cses.fi/user/3234
n = int(input())
l1 = input().split()[:n]
new = len(set(l1)) 
print(new)

    
