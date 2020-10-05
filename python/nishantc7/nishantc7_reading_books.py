# Reading Books : There are n books, and Kotivalo and Justiina are going to read them all. For each book, you know the time it takes to read it.
# https://cses.fi/problemset/task/1631/

n = int(input())
books = list(map(int,input().split()))
books = sorted(books)
print(max(sum(books),2*books[-1]))

# author : nishantc7
# profile : https://cses.fi/user/32680