# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1713/
# QUESTION
# Given n integers, your task is to report for each integer the number of its divisors.
# For example, if x=18, the correct answer is 6 because its divisors are 1,2,3,6,9,18.
# -------------------------------------------------------------------------------------------------
import math
n= int(input())
# for x in range()
# numarray=map(int,input().split())
arrlist = []
for x in range(0,n):
    arrlist.append(int(input()))
# print(numarray)
def countDivisors(n):
    count = 0
    for i in range(1,(int)(math.sqrt(n))+1) : 
        if (n % i == 0) : 
            if (n / i == i): 
                count = count + 1
            else: 
                count = count + 2

    print(count) 

for y in arrlist:
    countDivisors(y)

# countDivisors(n)               