#Missing Number
#You are given all numbers between 1,2,…,n except one.
#Your task is to find the missing number.
#problem link: https://cses.fi/problemset/task/1083
#user id: SanketKN
#cses user link: https://cses.fi/user/33432

x = int(input())
n = list(map(int,input().split()))[:x-1]
y = (x*(x+1)//2)-sum(n)
print(y)
