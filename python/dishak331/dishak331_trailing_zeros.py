# Print your Name
# cses.fi/printName
print('Disha Kapoor')
# author: dishak331
# solution: https://cses.fi/problemset/result/1067460/

import math
def trailing_zero(n):
    i=5
    c=0
    while n//i>=1:
        c+= n//i
        i = i*5
    return c
    

n = int(input())
print(trailing_zero(n))
