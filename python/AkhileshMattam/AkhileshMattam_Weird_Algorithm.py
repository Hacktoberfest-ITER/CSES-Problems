#Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
# 3→10→5→16→8→4→2→1
#program link :https://cses.fi/problemset/task/1068
#Author : AkhileshMattam
#result link :https://cses.fi/user/32346
n = int(input())
l1 = [n,]
while n>1:
    if n%2==0:
        n=int(n/2)
        l1.append(n)
    else:
        n=int((n*3)+1)
        l1.append(n)
new = " ".join(map(str,l1))
print(new)