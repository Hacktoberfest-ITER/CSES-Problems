#QN. Given an array of n integers, your task is to count the number of 
# subarrays where the sum of values is divisible by n

# Link - https://cses.fi/problemset/task/1662/

def subCount(arr, n):

	mod = []
	for i in range(n + 1):
		mod.append(0)

	
	csum = 0
	for i in range(n):
		csum = csum + arr[i]

		mod[((csum % n)+n) % n] = mod[((csum % n)+n) % n] + 1

	r= 0  

	for i in range(n):

		
		if (mod[i] > 1):
			r= r + (mod[i]*(mod[i]-1))//2

	
	r = r + mod[0]

	return r




n=int(input())
arr = list(map(int, input().strip().split()))[:n]
print(subCount(arr, n))


#Author - SoumyaKB96
#Profile - https://cses.fi/user/32322
