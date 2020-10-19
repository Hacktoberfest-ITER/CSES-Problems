# Problem Link : https://cses.fi/problemset/task/1068
# Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two,
# and if n is odd, the algorithm multiplies it by three and adds one
# The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
# 3→10→5→16→8→4→2→1

a = int(input())
while a > 1:
    print(int(a))
    if a % 2 == 0:
        a = a / 2
    else:
        a = (a * 3) + 1
print(1)
# author : Sharma-chanism
# Result Link : https://cses.fi/user/33304
