# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1068/

n= int(input())
print(n,end=" ")
while(n!=1):
    if(n%2==0):
        n=n//2
    else:
        n=n*3+1
    print(n,end=" ")    
