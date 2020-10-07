# User ID : https://cses.fi/user/32480

# Problem Number:  https://cses.fi/problemset/task/1617/

# Aurthor: bikash1317

# Question:
# Time limit: 1.00 s Memory limit: 512 MB
# Your task is to calculate the number of bit strings of length n.

# For example, if n=3, the correct answer is 8, because the possible bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.


mod = 1000000007
number = int (input(''))
i = 1 
while (number > 0):
    i = (i*2)%mod
    number = number -1
print (int(i))