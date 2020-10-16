# Question
# Given a string, your task is to generate all different strings that can be created using its characters.


# Link
# https://cses.fi/problemset/task/1622

from itertools import permutations
def main():
    string = input()
    permList = permutations(string)
    permList = sorted(set(permList))
    print(len(permList))
    for perm in permList:
        print(''.join(perm))
main()

# author: nisargsheth
# profile: https://cses.fi/user/9669
# solution: https://cses.fi/problemset/result/384136/
