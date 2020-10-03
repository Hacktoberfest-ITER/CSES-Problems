def de_bruijn(k, n):
    try:
        _ = int(k)
        alphabet = list(map(str, range(k)))
 
    except (ValueError, TypeError):
        alphabet = k
        k = len(k)
 
    a = [0] * k * n
    sequence = []
 
    def db(x, y):
        if x > n:
            if n % y == 0:
                sequence.extend(a[1:y + 1])
        else:
            a[x] = a[x - y]
            db(x + 1, y)
            for j in range(a[x - y] + 1, k):
                a[x] = j
                db(x + 1, x)
    db(1, 1)
    return "".join(alphabet[i] for i in sequence)
 
n = int(input())
print(de_bruijn(2, n), end='')
for i in range(1, n):
    print(0, end='')