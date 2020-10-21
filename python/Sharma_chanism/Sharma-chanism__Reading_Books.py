# Problem link: https://cses.fi/problemset/task/1631
# There are n books, and Kotivalo and Justiina are going to read them all.
# For each book, you know the time it takes to read it.
# They both read each book from beginning to end, and they cannot read a book at the same time.
# What is the minimum total time required?


a = int(input())
b = list(map(int, input().split()))
s = sum(b)
c = max(b)
if s-c >= c:
    print(s)
else:
    print(c*2)

# Author: Sharma-chanism
# User ID : https://cses.fi/user/33304
