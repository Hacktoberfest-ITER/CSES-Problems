//Question - Your task is to count for k=1,2,…,n the number of ways two knights can be placed on a k×k chessboard so that they do not attack each other.
//link - https://cses.fi/problemset/task/1072



#include <iostream>

using namespace std;

int main()
{
    long long n;
    cin>>n;
    for(long long i = 1;i<=n;i++)
    {
    long long total = (i*i)*(i*i-1)/2 ;
    long long attack = 4*(i-1)*(i-2) ;
    cout<<total-attack<<endl ;
    }
    return 0;
}


//Author : SouravReal a.k.a Sourav_K_P
//Profile: https://cses.fi/user/32489
//result - https://cses.fi/problemset/result/1134944/