g=lambda:map(int,input().split())
a,b=g()
l=list(g())
s={}
for i in range(a):
    n=b-l[i]
    if n in s:
        print(s[n]+1,i+1)
        exit()
    s[l[i]]=i
else:
	print("IMPOSSIBLE")