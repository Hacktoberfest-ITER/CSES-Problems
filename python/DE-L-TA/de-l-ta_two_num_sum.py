#You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.
# https://cses.fi/problemset/task/1640
# author:Mayank sahu


g=lambda:map(int,input().split())
a,b=g()
l=list(g())
s={}
for i in range(a):
    n=b-l[i]
    if n in s:
        print(s[n]+1,i+1)
        exit()
    s[l[i]]=i
else:
	print("IMPOSSIBLE")