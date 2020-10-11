#Author-Mayank Sahu
#You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.
#link-question:https://cses.fi/problemset/task/1640


i=input
t,s=int(i()),0

for i in i().split():
    s+=int(i)
print(t*(t+1)//2-s)