# User ID :            https://cses.fi/user/32480
# Problem Number :    https://cses.fi/problemset/task/1068/

# Author : bikash1317

# Question:
# Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
# 3→10→5→16→8→4→2→1

# Your task is to simulate the execution of the algorithm for a given value of n.


number = int (input())
print (int (number)) 
while(number != 1 and number > 0):
    if(number % 2 == 0):
        number = number/2
    else:
        number = (number*3) + 1

    print (int (number))