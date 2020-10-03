//Question
//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

//https://cses.fi/problemset/task/1083/

#include "iostream"

int main()
{
    double size;
    std::cin>>size;
    double t=0;
    t=size*(size+1)*0.5;
    for(int i=0; i<size-1; i++)
    {
        int tmp;
        std::cin>>tmp;
        t-=tmp;
    }
    std::cout<<t<<std::endl;
    return 0;
}

//author : Rohan Verma
//solution : https://cses.fi/problemset/result/1068500/