//Question
/*Your task is to calculate the number of bit strings of length n.
For example, if n=3, the correct answer is 8, because the possible 
bit strings are 000, 001, 010, 011, 100, 101, 110, and 111.*/

//https://cses.fi/problemset/task/1617

#include "iostream"

int main()
{
    int n;
    std::cin>>n;
    int  outp = 1;
    for(int i=n; i>0; i--)
    {
        outp = (outp*2)%1000000007;
    }
    std::cout<<outp;
    return 0;
}

//author : Rohan Verma
//solution : https://cses.fi/problemset/result/1089156/