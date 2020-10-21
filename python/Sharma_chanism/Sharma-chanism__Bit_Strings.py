# Your task is to calculate the number of bit strings of length n. For example, if n=3, the correct answer is 8,
# because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
# Problem Link: https://cses.fi/problemset/task/1617
n = int(input())
print((2 ** n) % ((10 ** 9) + 7))
# Author: Sharma-chanism
# User ID - https://cses.fi/user/33304
