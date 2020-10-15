# Question
# You are given an array of n integers. 
# You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
# On each turn, you may increase the value of any element by one. 
# What is the minimum number of turns required?

# Link: https://cses.fi/problemset/task/1094

n = int(input())
numbers = input().split()
numbers = list(map(int, numbers))

total = 0
m = numbers[0]

for i in range(n-1):
    if numbers[i] > numbers[i+1]:
        total += abs(numbers[i] - numbers[i+1])
        numbers[i+1] = numbers[i]

print(total)

# author: Ashis-007
# profile: https://cses.fi/user/32353
# Solution: https://cses.fi/problemset/result/1067119/