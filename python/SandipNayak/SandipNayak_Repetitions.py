# Author: Sandip Nayak
# You are given a DNA sequence: a string consisting of characters A, C, G, and T.
# Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
# https://cses.fi/problemset/task/1069
# userId: https://cses.fi/user/34086

num = input()
def count(num):
    b=c=0
    for i in range(0,len(num)):
        if num[i]==num[i-1]:
            c+=1
            b=max(b,c)
        else:
            c=1
            b=max(b,c)
    print(b)
    
count(num)

