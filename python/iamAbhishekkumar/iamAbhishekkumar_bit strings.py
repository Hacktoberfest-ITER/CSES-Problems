#  user id :
# https://cses.fi/user/32366
# Your task is to calculate the number of bit strings of length n. For example, if n=3, the correct answer is 8,
# because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
# https://cses.fi/problemset/task/1617/
# author : iamAbhishekkumar

print(2 ** int(input()) % 1000000007)
