# Question: Your task is to calculate the number of bit strings of length n. For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.
# Link: https://cses.fi/problemset/task/1617/
# author: jyotij
# profile: https://cses.fi/user/32333
# solution: https://cses.fi/problemset/result/1138609/

m = 1000000007
n = int (input(''))
i = 1 
while (n > 0):
    i = (i*2)%m
    n = n - 1
print (int(i))