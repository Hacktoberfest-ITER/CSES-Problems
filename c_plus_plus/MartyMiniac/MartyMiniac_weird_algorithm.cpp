//Question
//Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
//3→10→5→16→8→4→2→1
//Your task is to simulate the execution of the algorithm for a given value of n.
//https://cses.fi/problemset/task/1068/

#include "iostream"

int main()
{
    unsigned long int inp;
    std::cin>>inp;

    std::cout<<inp<<" ";
    while(inp!=1)
    {
        if(inp%2==0)
        {
            inp/=2;
        }
        else
        {
            inp=inp*3+1;
        }
        std::cout<<inp<<" ";
    }
    return 0;
}

//author : Rohan Verma
//solution : https://cses.fi/problemset/result/1066182/