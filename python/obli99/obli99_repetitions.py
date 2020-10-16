# Question: Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
# Link: https://cses.fi/problemset/task/1069/
# author: jyotij
# profile: https://cses.fi/user/32333
# solution: https://cses.fi/problemset/result/1138905/

st = input()
def count(st):
    x = 0
    y = 0
    for i in range(0,len(st)):
        if st[i]==st[i-1]:
            y=y+1
            x=max(x,y)
        else:
            y=1
            x=max(x,y)
    print(x)
    
count(st)