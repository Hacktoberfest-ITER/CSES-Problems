# You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
# https://cses.fi/problemset/task/1069/

dna= input()+" "
count=1
maxcount=1
for i in range(len(dna)-1):
    if dna[i]==dna[i+1]:
        count+=1
    else:
        if count>maxcount:
            maxcount=count
        count=1
print(maxcount)

# author: deadcoder
# https://cses.fi/user/32336