#Qn. Given an array of n integers, 
# your task is to count the number of subarrays having sum x.

# Link - https://cses.fi/problemset/task/1661/

from collections import defaultdict
def SubSum(arr, n, Sum):
	
    psum = defaultdict(lambda: 0)

    res = 0
    csum = 0

    for i in range(0, n):
        csum += arr[i]
        
        if csum == Sum:
            res += 1

        
        if (csum - Sum) in psum:
            res += psum[csum - Sum]

        
        psum[csum] += 1

    return res


if __name__ == "__main__":

    n,x= input().split()
    n=int(n)
    x=int(x)
    arr = list(map(int, input().strip().split()))[:n]
    print(SubSum(arr, n, x))

#Author - SoumyaKB96
# Profile - https://cses.fi/user/32322
