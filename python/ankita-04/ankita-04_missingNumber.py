# Author: Ankita Satapathy
# find the missing number.
# https://cses.fi/problemset/task/1083/
# userId: https://cses.fi/user/32881

n = int(input())
array=map(int,input().split())
print(int(((n*(n+1))/2)-sum(array)))
