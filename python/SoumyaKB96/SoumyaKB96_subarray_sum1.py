#Qn. Given an array of n positive integers, your task is to count the number of subarrays having sum  x
# Q LInk - https://cses.fi/problemset/task/1660/

from collections import defaultdict
def SubarraySum(arr, n, Sum):

    psum = defaultdict(lambda: 0)
    res = 0
    cursum = 0

    for i in range(0, n):
        cursum += arr[i]

       
        if cursum == Sum:
            res += 1

        
        if (cursum - Sum) in psum:
            res += psum[cursum - Sum]

       
        psum[cursum] += 1

    return res


n, x = input().split()
n = int(n)
x = int(x)
arr = []
arr = list(map(int, input().strip().split()))[:n]

print(SubarraySum(arr, n, x))

#Author : SoumyaKB96
# Profile : https://cses.fi/user/32322


