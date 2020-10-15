# Question
# You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
# Your task is to find the longest repetition in the sequence. 
# This is a maximum-length substring containing only one type of character.

# Link
# https://cses.fi/problemset/task/1069

strings = list(input())
best = 0
curr = 0

for i in range(len(strings)):
    if strings[i] != strings[i-1]:
        best = best if best > curr else curr
        curr = 0
    curr += 1

best = best if best > curr else curr
print(best)

# author: Ashis-007
# profile: https://cses.fi/user/32353
# solution: https://cses.fi/problemset/result/1066368/


