# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1617/
# Your task is to calculate the number of bit strings of length n.
# QUESTION
# For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
n= int(input())
print((2**n) % ((10**9)+7))