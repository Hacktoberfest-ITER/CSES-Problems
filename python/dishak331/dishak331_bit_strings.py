# Print your Name
# cses.fi/printName
print('Disha Kapoor')
# author: dishak331
# solution: https://cses.fi/problemset/result/1068272/

mod = 1000000007
  

def power(x, y, p): 
    res = 1
  
    x = x % p
  
    while (y > 0): 
          

        if (y & 1): 
            res = (res * x) % p 
  
        y = y >> 1
        x = (x * x) % p 
  
    return res 
  

def findCount(N): 
    count = power(2, N, mod) 
    return count 

if __name__ == '__main__': 
    N = int(input())
    print(findCount(N)) 
