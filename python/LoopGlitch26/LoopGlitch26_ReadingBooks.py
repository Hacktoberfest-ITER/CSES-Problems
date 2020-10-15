# USER ID
# https://cses.fi/user/34034
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1631
# QUESTION
# There are n books, and Kotivalo and Justiina are going to read them all. For each book, you know the time it takes to read it. They both read each book from beginning to end, and they cannot read a book at the same time. What is the minimum total time required?

n,j=int(input()),list(map(int,input().split()))
print(sum(j) if sum(j)-max(j)>=max(j) else max(j)*2)