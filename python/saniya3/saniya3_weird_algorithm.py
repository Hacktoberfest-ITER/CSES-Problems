# Weird algorithm
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