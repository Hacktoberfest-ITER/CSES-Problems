# author: https://cses.fi/user/32392
# @belikesayantan

''' Sum of Two Values - https://cses.fi/problemset/task/1640
You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.
'''

def TwoSum(n: 'int length of the array', x: 'int target', arr: 'list of integers') -> str:
    temp = dict()
    for i in range(n):
        curr = arr[i]
        if x - curr in temp:
            return "{} {}".format(i + 1, temp[x - curr] + 1)
        else:
            temp[curr] = i
    return "IMPOSSIBLE"



if __name__ == "__main__":
    print(TwoSum(*(int(x) for x in input().split()), [int(x) for x in input().split()]))
