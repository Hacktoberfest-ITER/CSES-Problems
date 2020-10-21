//Question
/*There are n apples with known weights.
Your task is to divide the apples into two groups so that the 
difference between the weights of the groups is minimal.*/

//https://cses.fi/problemset/task/1623/

#include "iostream"
#include "cmath"

int main()
{    
    int n;
    std::cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        std::cin>>arr[i];
    }
    int diff=0;
    int p=pow(2,n);

    double g1=0, g2=0;
    double mindif=2147483647;
    for(int i=0; i<p; i++)
    {
        int t=i;
        g1=0;
        g2=0;
        for(int j=0; j<n; j++)
        {
            if(t%2==0)
            {
                g1+=arr[j];
            }
            else
            {
                g2+=arr[j];
            }
            t/=2;
        }
        double diff=g2-g1;
        if(diff<0)
        {
            diff*=-1;
        }
        mindif=mindif>diff?diff:mindif;
        if(mindif==0)
        break;
    }
    std::cout<<(int)mindif;
}

//author : Rohan Verma
//solution : https://cses.fi/problemset/result/1096672/