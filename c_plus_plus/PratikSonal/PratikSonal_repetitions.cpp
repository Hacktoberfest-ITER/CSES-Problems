//Question
//You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
//https://cses.fi/problemset/task/1069/

#include "iostream"

int main(){
    std::string dna;
    std::cin >> dna;
    char track = dna[0];
    int count = 0;
    int check = 0;
    for(char c : dna){
        if(track == c){
            count++;
        }else{
            track = c;
            count = 1;
        }
        if(check < count){
            check = count;
        }
    }
    std::cout<<check;
    return 0;
}

//author : Pratik Sonal
//CSES profile : https://cses.fi/user/34290
//solution : https://cses.fi/problemset/result/1141450/