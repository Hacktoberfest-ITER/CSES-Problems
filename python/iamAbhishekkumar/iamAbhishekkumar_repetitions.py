#  user id :
# https://cses.fi/user/32366

# You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest
# repetition in the sequence. This is a maximum-length substring containing only one type of character.
# https://cses.fi/problemset/task/1069/
# author : iamAbhishekkumar

s = input()
count = 1
lis = []
for i in range(len(s) - 1):
    if s[i] == s[i + 1]:
        count += 1
    else:
        lis.append(count)
        count = 1
lis.append(count)
print(max(lis))
