#question link : https://cses.fi/problemset/task/1069
#author Mayank Sahu
#You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find 
#the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

d=input()
g,c,e=d[0],1,1
for i in range(1,len(d)):
    if g==d[i]:
        c+=1
        if e < c:
            e=c
            

    else:
        g=d[i]
        c=1
print(e)