# Question
# Consider an algorithm that takes as input a positive integer n.
# If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.

# https://cses.fi/problemset/task/1068/

n=int(input())
print(n,end=" ")
while (n!=1):
  n = n//2 if n%2==0 else n*3+1
  print(n,end=" ")

# author: deadcoder
# solution: https://cses.fi/problemset/result/1065540/