#
# Q.You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
# Link - https://cses.fi/problemset/task/1083/


n=int(input())
arr=[]
arr = list(map(int,input().strip().split()))[:n-1] 

  
print(int(n*(n+1)/2)-sum(arr))    


      
    
    
#Author :SoumyaKB
# Profile : https://cses.fi/user/32322
