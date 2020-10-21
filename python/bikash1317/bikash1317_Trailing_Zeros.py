# User ID :   https://cses.fi/user/32480
# Problem Number ID :  https://cses.fi/problemset/task/1618

# Aurthor : bikash1317

# Question:
# Your task is to calculate the number of trailing zeros in the factorial n!.

# For example, 20!=2432902008176640000 and it has 4 trailing zeros.


number = int(input (''))
i=5
countZeros = 0
while(number >= i):
    countZeros = countZeros + int((number/i))
    i = i * 5
print (countZeros)
