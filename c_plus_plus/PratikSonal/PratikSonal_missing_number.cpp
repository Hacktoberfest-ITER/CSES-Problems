//Question
//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.
//https://cses.fi/problemset/task/1083/

#include "iostream"

int main(){
    double num;
    std::cin >> num;
    double count  = num * (num+ 1) * 0.5;
    for(int i = 0; i < num - 1; i++){
        int temp;
        std::cin>>temp;
        count -= temp;
    }
   std::cout<<count;
    return 0;
}

//author : Pratik Sonal
//CSES profile : https://cses.fi/user/34290
//solution : https://cses.fi/problemset/result/1141369/