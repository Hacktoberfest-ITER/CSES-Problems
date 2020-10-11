# Author: Ankita Satapathy
# Calculate the number of bit strings of length n.
# https://cses.fi/problemset/task/1617/
# userId: https://cses.fi/user/32881

n= int(input())
print((2**n) % ((10**9)+7))
