# Repetitions:
# You are given a DNA sequence: a string consisting of characters A, C, G, and T.
# Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
# https://cses.fi/problemset/task/1069/

n = input()
def count(n):
    b=c=0
    for i in range(0,len(n)):
        if n[i]==n[i-1]:
            c+=1
            b=max(b,c)
        else:
            c=1
            b=max(b,c)
    print(b)
    
count(n)

# author: saniya3
# https://cses.fi/user/32262
