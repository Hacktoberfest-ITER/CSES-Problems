# Question
# Your task is to divide the numbers 1,2,…,n into two sets of equal sum.


# Link
# https://cses.fi/problemset/task/1092

def main():
    
    n = int(input())
    arr = []
    if(n*(n+1)%4!=0):
        print("NO")
        return
    reqsum = (n*(n+1))//4
    cursum = 0
    ptr = 1
    if(reqsum%n==0):
        cursum+=n
        arr.append(n)
        k=0
    else:
        k=1
    while(cursum!=reqsum):
        cursum+=n+k
        arr.append(ptr)
        arr.append(n-ptr+k)
        ptr+=1    
    arr.sort()
    st1 = ''
    st2 = ''
    ptr = 0
    for i in range(0,n):
        if(arr[ptr]==i+1):
            st1 += str(arr[ptr])+' '
            ptr+=1
        else:
            st2+=str(i+1)+' '
    print("YES")
    print(len(arr))
    print(st1)
    print(n-len(arr))
    print(st2)
            
 
main()
# author: nisargsheth
# profile: https://cses.fi/user/9669
# solution: https://cses.fi/problemset/result/383632/
