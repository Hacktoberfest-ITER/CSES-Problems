# Restaurant Customers : You are given the arrival and leaving times of n customers in a restaurant. What was the maximum number of customers?
# https://cses.fi/problemset/task/1619/


import sys
def max_people(times):
    count, max_count = 0, 0

    for time in times:
        count = count + time[1]
        
        if count > max_count:
            max_count = count

    return max_count


def main():
    n = int(sys.stdin.readline())
    times = []
    
    for _ in range(n):
        a, b = map(int,sys.stdin.readline().split())
        times.append((int(a), 1))
        times.append((int(b), -1))
    times.sort()
    print(max_people(times))

if __name__ == "__main__":
    main()

# author : nishantc7
# profile : https://cses.fi/user/32680