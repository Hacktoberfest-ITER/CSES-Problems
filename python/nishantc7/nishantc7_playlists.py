# Playlist : You are given a playlist of a radio station since its establishment. The playlist has a total of n songs.
# https://cses.fi/problemset/task/1141/


from collections import defaultdict
n = int(input())
a = [int(x) for x in input().split()]
index = defaultdict(lambda : 0)
ans = 0
j = 0

for i in range(n): 

	# Update j based on previous 
	# occurrence of a[i] 
	j = max(index[a[i]], j) 
	# Update ans to store maximum 
	# length of subarray 
	ans = max(ans, i - j + 1) 
	index[a[i]] = i + 1
	i += 1

	# Return final ans 
print(ans)

# author : nishantc7
# profile : https://cses.fi/user/32680