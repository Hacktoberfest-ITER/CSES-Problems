# User ID : https://cses.fi/user/32480

# Problem Number: https://cses.fi/problemset/result/1133272/

# Aurthor: bikash1317

# Question: 
# Let σ(n) denote the sum of divisors of an integer n. For example, σ(12)=1+2+3+4+6+12=28.

# Your task is to calculate the sum ∑ni=1σ(i) modulo 109+7.

# Input

# The only input line has an integer n.

def sumOfDivisors(n):
    ans=0
    i=1
    while(i<=n):
        r=n//(n//i)
        ans+=(n//i)*((r*(r+1))//2-i*(i-1)//2)
        i=r+1
    return ans%(10**9+7)
n=int(input())
print(sumOfDivisors(n))