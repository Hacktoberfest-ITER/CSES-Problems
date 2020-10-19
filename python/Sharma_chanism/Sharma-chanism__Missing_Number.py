a = int(input())
b = list(map(int, input().split()))
s = 0
for i in range(a - 1):
    s = s + b[i]
c = ((a * (a + 1)) / 2) - s
print(int(c))
