# You are given a DNA sequence: a string consisting of characters A, C, G, and T.
# Your task is to find the longest repetition in the sequence.
# This is a maximum-length substring containing only one type of character.
# https://cses.fi/problemset/task/1069/

string= input()+" "
c=1
max=1
for i in range(len(string)-1):
    if string[i]==string[i+1]:
        c+=1
    else:
        if c>max:
            max=c
        c=1
print(max)

# author : PrernaBabber
# https://cses.fi/user/32267