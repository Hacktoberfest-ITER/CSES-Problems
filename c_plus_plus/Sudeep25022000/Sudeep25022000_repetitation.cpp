/*
Repetitions

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.

Input

The only input line contains a string of n characters.

Output

Print one integer: the length of the longest repetition.

Constraints
1≤n≤10^6

 Question link : https://cses.fi/problemset/task/1069

 Profile Link :https://cses.fi/user/32476

 Author: Sudeep Swain(https://github.com/Sudeep25022000)

*/
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string s;
    cin >> s;
    int n = s.length(), highestrepeatation = 0, repeatation = 1;
    for (int i = 1; i < n; i++)
    {
        if (s[i] != s[i - 1])
        {
            highestrepeatation = max(highestrepeatation, repeatation);
            repeatation = 0;
        }
        repeatation++;
    }
    highestrepeatation = max(highestrepeatation, repeatation);
    cout << highestrepeatation;
    return 0;
}
