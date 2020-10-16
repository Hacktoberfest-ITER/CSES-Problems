# Question
# Your task is to calculate the number of trailing zeros in the factorial n!.
# For example, 20!=2432902008176640000 and it has 4 trailing zeros.


# Link
# https://cses.fi/problemset/task/1618
def main():
    
    n = int(input())
    cnt = 0
    while(n!=0):
        n//=5
        cnt+=n
    print(cnt)
main()

# author: nisargsheth
# profile: https://cses.fi/user/9669
# solution: https://cses.fi/problemset/result/383640/
