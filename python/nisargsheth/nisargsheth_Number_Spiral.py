# Question
# A number spiral is an infinite grid whose upper-left square has number 1. Here are the first five layers of the spiral:

# Your task is to find out the number in row y and column x.


# Link
# https://cses.fi/problemset/task/1071
def main():
    t = int(input())
    for t_itr in range(0,t):
        y,x = map(int,input().split())
        if(x>y):
            if(x%2==1):
                print(x*x - y + 1)
            else:
                x-=1
                print(x*x+y)
        else:
            if(y%2==0):
                print(y*y-x+1)
            else:
                y-=1
                print(y*y+x)
main()

# author: nisargsheth
# profile: https://cses.fi/user/9669
# solution: https://cses.fi/problemset/result/382948/
