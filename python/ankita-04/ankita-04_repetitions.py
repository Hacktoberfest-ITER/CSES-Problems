# Author: Ankita Satapathy
# find the longest repetition in the sequence.
# https://cses.fi/problemset/task/1069/
# userId: https://cses.fi/user/32881

a = input()
def count(n):
    x=y=0
    for i in range(0,len(a)):
        if a[i]==a[i-1]:
            y=y+1
            x=max(x,y)
        else:
            y=1
            x=max(x,y)
    print(x)
    
count(a)
