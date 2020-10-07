

/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T.
Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

*/
// link : https://cses.fi/problemset/task/1069

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

 int main()
 {

    string in;
    cin>>in;
    long long max=1;
    long long c=1;
    for(int i=1;i<in.length();i++)
    {
        if(in[i]!=in[i-1])
        {
            if(max<c)
                max=c;
            c=0;
        }
        c++;
    }
    if(max<c)
     max=c;
    cout<<max;

 }

 //author  : Ayushsahoo
 //profile : https://cses.fi/user/32495
