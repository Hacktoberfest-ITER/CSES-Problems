# Question: Consider an algorithm that takes as input a positive integer n.  If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one.
# Link: https://cses.fi/problemset/task/1068/
# author: jyotij
# profile: https://cses.fi/user/32333
# solution: https://cses.fi/problemset/result/1133081/

n = int((input()))
print(n, end=" ")
while n != 1:
    if n % 2 == 0:
        n //= 2
    elif n%2!=0:
        n = n * 3 + 1

    print(n, end=" ")