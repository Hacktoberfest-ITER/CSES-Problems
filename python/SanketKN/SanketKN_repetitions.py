#repetitions
#You are given a DNA sequence: a string consisting of characters A, C, G, and T.
#Your task is to find the longest repetition in the sequence.
#problem link: https://cses.fi/problemset/task/1069
#user id: SanketKN
#cses user link: https://cses.fi/user/33432

x = input()
k = f = 1
for i in range(0,len(x)-1):  
    if x[i] == x[i+1]:
        f+=1
        k = max(f,k)
    else:
        f = 1
print(k)
