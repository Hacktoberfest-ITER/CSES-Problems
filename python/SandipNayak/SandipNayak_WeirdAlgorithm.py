# Author: Sandip Nayak
#Consider an algorithm that takes as input a positive integer n. 
# If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
# The algorithm repeats this, until n is one. 
# https://cses.fi/problemset/task/1068
#userId: https://cses.fi/user/34086

n = int(input())
print(n, end=" ")
while(n!= 1):
    if(n % 2 == 0):
        n = n//2
    else:
        n = n*3+1
    print(n,end=" ")   
