#  user id :
# https://cses.fi/user/32366
# There are n sticks with some lengths. Your task is to modify the sticks so that each stick has the same length.
# You can either lengthen and shorten each stick. Both operations cost x where x is the difference between the new
# and original length.
# What is the minimum total cost?

# https://cses.fi/problemset/task/1074/
# author : iamAbhishekkumar

from statistics import median

n = int(input())
l = list(map(int, input().split()))
median = int(median(l))
cost = 0
for i in l:
    cost += abs(median - i)
print(cost)
