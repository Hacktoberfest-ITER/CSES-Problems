# Weird algorithm:
#Consider an algorithm that takes as input a positive integer n. 
# If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. 
# The algorithm repeats this, until n is one. 
# https://cses.fi/problemset/task/1068/

x=int(input())
def alg(n): 
    
    while n != 1: 
        print(n, end = ' ') 
  
        if n & 1: 
            n = 3 * n + 1
  
        else: 
            n = n // 2
  
    print(n) 
alg(x)

# author: saniya3
# https://cses.fi/user/32262
