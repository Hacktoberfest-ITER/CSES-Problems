# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1622/
# QUESTION
# Your task is to calculate the number of trailing zeros in the factorial n!.
# For example, 20!=2432902008176640000 and it has 4 trailing zeros.
def trailingZeros(n):  
    count = 0
    i=5
    while (n/i>=1): 
        count += int(n/i) 
        i *= 5
  
    return int(count) 
  
  
n = int(input())
print(trailingZeros(n)) 