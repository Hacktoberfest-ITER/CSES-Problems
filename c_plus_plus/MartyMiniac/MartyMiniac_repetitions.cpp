//Question
//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//https://cses.fi/problemset/task/1069/

#include "iostream"
#include "string"

int main()
{
    char buf;
    int max=0, curr=0;
    std::string inp;
    getline(std::cin, inp);
    buf=inp[0];
    for(char ch:inp)
    {
        if(buf==ch)
        {
            curr++;
        }
        else
        {
            buf=ch;
            if(curr>max)
            {
                max=curr;
            }
            curr=1;
        }
    }
    if(curr>max)
    {
        max=curr;
    }
    if(max==0)
    {
        max=curr;
    }
    std::cout<<max;
    return 0;
}

//author : Rohan Verma
//solution : https://cses.fi/problemset/result/1068618/