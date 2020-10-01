# Print your Name
# cses.fi/printName
print('Disha Kapoor')
# author: dishak331
# solution: https://cses.fi/problemset/result/1065831/

def missing_num(n):
    n=sorted(n)
    n.append(0)
    for i in range(1,len(n)+1):
        if i!=n[i-1]:
            return i

input()
n = list(map(int, input().split(" ")))
print(missing_num(n))