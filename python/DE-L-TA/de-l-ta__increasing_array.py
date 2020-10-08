#link-problem:https://cses.fi/problemset/task/1094
#Author-Mayank Sahu
#You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
#On each turn, you may increase the value of any element by one. What is the minimum number of turns required?

i=input
t=i()
n,c,d=0,1,1
 
 
for i in i().split():
    i=int(i)
    d+=1 
    if c>i:
        n+=c-i
    else:
        c=i
if d==int(t):
  print(n)
else:
  exit(0)
  
  
