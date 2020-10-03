#Given an array of n integers, your task is to find the maximum sum of values in a contiguous, nonempty subarray.
#Qn Link - https://cses.fi/problemset/task/1643/
from sys import maxsize
def maxSubArraySum(a,size): 
       
    max_so_far = -maxsize - 1
    max_ending_here = 0
       
    for i in range(0, size): 
        max_ending_here = max_ending_here + a[i] 
        if (max_so_far < max_ending_here): 
            max_so_far = max_ending_here 
  
        if max_ending_here < 0: 
            max_ending_here = 0   
    return max_so_far 
   
n=int(input())
arr=[]
arr = list(map(int,input().strip().split()))[:n] 

print(maxSubArraySum(arr,n)) 
   
#Author - SoumyaKB96
# Profile - https://cses.fi/user/32322
