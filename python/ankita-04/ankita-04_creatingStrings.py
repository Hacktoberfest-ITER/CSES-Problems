# Author: Ankita Satapathy
# generate all different strings that can be created using its characters.
# https://cses.fi/problemset/task/1622/
# userId: https://cses.fi/user/32881

from itertools import permutations
n = input() 
p = permutations(n)
arraylist = []
for x in list(p):
    arraylist.append(''.join(i))
alist = sorted(list(set(arraylist)))
print(len(alist))

for y in alist:
    print(j)
