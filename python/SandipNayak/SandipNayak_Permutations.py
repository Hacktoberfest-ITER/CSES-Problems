# Author: Sandip Nayak
# A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.
# Given n, construct a beautiful permutation if such a permutation exists.
# https://cses.fi/problemset/task/1070
# userId: https://cses.fi/user/34086

num= int(input())

if (num==2 or num==3):
    print("NO SOLUTION")
elif (num==4):
    print("3 1 4 2")
else:
    perm=[str(i) for i in range (1,num+1,2)]
    perm+=[str(i) for i in range (2,num+1,2)]
    print(" ".join(perm))
