#  user id :
# https://cses.fi/user/32366

# A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.
# Given n, construct a beautiful permutation if such a permutation exists.
# https://cses.fi/problemset/task/1070/
# author : iamAbhishekkumar

n = int(input())
if n == 1:
    print(1)
elif n < 4:
    print("NO SOLUTION")
elif n == 4:
    print("3 1 4 2")
else:
    for i in range(1, n+1, 2):
        print(i, end=" ")
    for i in range(2, n+1, 2):
        print(i, end=" ")
