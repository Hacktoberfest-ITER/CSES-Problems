# Missing number:
# You are given all numbers between 1,2,…,n except one.Your task is to find the missing number.
# https://cses.fi/problemset/task/1083/

n=int(input())
y=[int(i) for i in input().split()]

def missing(seq,num):
    n=len(seq)+1
    total=n*(n+1)/2
    print(int(total-sum(seq)))
    
missing(y,n)

# author: saniya3
# https://cses.fi/user/32262
