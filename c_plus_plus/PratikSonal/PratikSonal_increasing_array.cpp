//Question
//You are given an array of n integers. You want to modify the array so that it is increasing,
//i.e., every element is at least as large as the previous element.
//On each turn, you may increase the value of any element by one. 
//What is the minimum number of turns required?
//https://cses.fi/problemset/task/1094

#include "iostream"

int main(){
    int size;
    std::cin >> size;
    long count = 0;
    long track = 0;
    std::cin>>track;
    for(int i = 1; i < size; i++){
        long temp = 0;
        std::cin>>temp;
        if(track > temp){
            count += (track - temp);
        }else{
        track = temp;
        }
    }
    std::cout<<count;
    return 0;
}

//author : Pratik Sonal
//CSES profile : https://cses.fi/user/34290
//solution : https://cses.fi/problemset/result/1141546/