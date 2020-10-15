# Question
# You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

# Link
# https://cses.fi/problemset/task/1083/
n = int(input())
numbers = input().split()
numbers = list(map(int, numbers))
missing_sum = 0

for i in numbers:
    missing_sum += i

original_sum = n * (n + 1) // 2
print(original_sum - missing_sum)

# author: Ashis-007
# profile: https://cses.fi/user/32353
# solution: https://cses.fi/problemset/result/1066259/