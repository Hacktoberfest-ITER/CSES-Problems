# Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
# 3→10→5→16→8→4→2→1
# Your task is to simulate the execution of the algorithm for a given value of n.
# https://cses.fi/problemset/task/1068

def weird(num):
    while num > 0 :
        if num == 1:
            print(num)
            exit()
        if num % 2 ==0:
            print(num, end=" ")
            num = (int)(num/2)
        else:
            print(num, end=" " )
            num = (int)(num * 3) + 1


num = int(input())
weird(num)

# author : PrernaBabber
# https://cses.fi/user/32267