#Trailing Zeros
#Your task is to calculate the number of trailing zeros in the factorial n!.
#problem link: https://cses.fi/problemset/task/1618
#user id: SanketKN
#cses user link: https://cses.fi/user/33432

x = int(input())
k = 0
while(x>4):
    x//=5
    k+=x
print(k)
