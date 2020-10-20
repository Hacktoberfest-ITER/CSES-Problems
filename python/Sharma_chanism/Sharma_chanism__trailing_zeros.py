# Problem link: https://cses.fi/problemset/task/1618
# Your task is to calculate the number of trailing zeros in the factorial n!.
# For example, 20!=2432902008176640000 and it has 4 trailing zeros.

a = int(input())
b = 5
c = 0
while a / b >= 1:
    c = c + int(a / b)
    b = b * 5
print(c)

# Author: Sharma-chanism
# User ID : https://cses.fi/user/33304
