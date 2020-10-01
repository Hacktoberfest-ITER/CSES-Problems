# Print your Name
# cses.fi/printName
print('Disha Kapoor')
# author: dishak331
# solution: https://cses.fi/problemset/result/1065973/

def repeat_counts(n):
    if len(n)==1:
        return 1
    maxx=c=0
    for i in range(1,len(n)):
        if n[i-1]==n[i]:
            c+=1
        if n[i-1]!=n[i] or i==len(n)-1:
            c+=1
            if maxx<c:
                maxx=c
            c=0

    return maxx
    

n = input()
print(repeat_counts(n))