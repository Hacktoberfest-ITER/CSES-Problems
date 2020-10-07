# Question
# Your task is to calculate the number of bit strings of length n.
# For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.


# Link
# https://cses.fi/problemset/task/1617

def main():
    
    n = int(input())
    print((2**n)%1000000007)
main()

# author: nisargsheth
# profile: https://cses.fi/user/9669
# solution: https://cses.fi/problemset/result/383637/
