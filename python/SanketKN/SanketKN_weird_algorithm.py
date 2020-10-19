#weird algorithm
#https://cses.fi/problemset/task/1068/
#Consider an algorithm that takes as input a positive integer n. 
#If n is even, the algorithm divides it by two, and if n is odd, 
#the algorithm multiplies it by three and adds one. The algorithm
#repeats this, until n is one.
x = int(input())
print(x, end=' ')
while x!=1:
    if x%2 != 0:
        x = (x*3)+1
    else: 
        x//=2
    print(x, end=' ')
    
#auther: SanketKN
#cses id : https://cses.fi/user/33432
