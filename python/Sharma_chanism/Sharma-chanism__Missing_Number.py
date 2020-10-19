# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
# Problem link : https://cses.fi/problemset/task/1083

a = int(input())
b = list(map(int, input().split()))
s = 0
for i in range(a - 1):
    s = s + b[i]
c = ((a * (a + 1)) / 2) - s
print(int(c))

# Author: Sharma-chanism
# Result: https://cses.fi/user/33304
