# Author: Ankita Satapathy
#Consider an algorithm that takes as input a positive integer n. 
# If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
# The algorithm repeats this, until n is one. 
# https://cses.fi/problemset/task/1068/
#userId: https://cses.fi/user/32881

num = int(input())
print(num, end=" ")
while(num != 1):
    if(num % 2 == 0):
        num = num//2
    else:
        num = num*3+1
    print(num,end=" ")    
