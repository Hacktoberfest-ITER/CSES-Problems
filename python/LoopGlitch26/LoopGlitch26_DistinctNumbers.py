# AUTHOR
# Bravish ghosh
# USER ID
# https://cses.fi/user/34034
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1621
# QUESTION
# You are given a list of n integers, and your task is to calculate the number of distinct values in the list.

def main():
    input()
    j = [i for i in input().split()]
    print(len(set(j)))


main()