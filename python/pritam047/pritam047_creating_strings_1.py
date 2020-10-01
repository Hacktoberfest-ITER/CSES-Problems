# USER ID
# https://cses.fi/user/32269
# PROBLEM NUMBER
# https://cses.fi/problemset/task/1622/
# QUESTION
# Given a string, your task is to generate all different strings that can be created using its characters.
from itertools import permutations
n = input() 
p = permutations(n)

arlist = []
for i in list(p):
    arlist.append(''.join(i))

nlist = sorted(list(set(arlist)))
print(len(nlist))

for j in nlist:
    print(j)



