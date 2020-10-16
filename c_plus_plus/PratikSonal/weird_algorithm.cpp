//Question
//Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
//3→10→5→16→8→4→2→1
//Your task is to simulate the execution of the algorithm for a given value of n.
//https://cses.fi/problemset/task/1068/

#include <bits/stdc++.h> 
#include <iostream>
 
int main(){
    long num;
    std::cin>> num;
    std::cout<< std::to_string(num)  + " ";
    while(num != 1){
        if(num % 2==0){
            num /= 2;
            std::cout<<std::to_string(num) + " ";
        }else{
            num = num * 3 + 1;
            std::cout<<std::to_string(num) + " ";
        }
    }
    return 0;
}
//author : Pratik Sonal
//CSES profile : https://cses.fi/user/34290
//solution : https://cses.fi/problemset/result/1140773/