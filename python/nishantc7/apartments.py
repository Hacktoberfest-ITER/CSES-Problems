# Apartments
#https://cses.fi/problemset/task/1084


m, n, k = map(int,input().split())
desired_size = list(map(int,input().split()))
avail_size = list(map(int,input().split()))
count = 0
desired_size.sort()
avail_size.sort()
i, j = 0, 0 
while(i < n and j < m):
    if (abs(avail_size[i] - desired_size[j]) <= k):
        count += 1
        i += 1
        j += 1
    
    elif (avail_size[i] < desired_size[j]):
        i += 1
    
    else:
        j += 1
    
print(count)

# author : nishantc7
# profile : https://cses.fi/user/32680
