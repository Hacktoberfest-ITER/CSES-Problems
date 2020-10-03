//You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
//Your task is to find the longest repetition in the sequence. 
//This is a maximum-length substring containing only one type of character.

// Link:https://cses.fi/problemset/task/1069/


#include<bits/stdc++.h>
using namespace std;

int main(){

   string s;
   cin>>s;

   int cnt=1;
   int ans=0;
   int n=s.size();

   for(int i=1;i<n;i++){
   	char c=s[i-1];

   	if(s[i]==c){
   		cnt++;
	   }
	   else{
	   ans=max(ans,cnt);
	   cnt=1;
     }
   }
   ans=max(ans,cnt);     //Here checking for corner cases e.g Input=A

   cout<<ans<<endl;


	return 0;
}


//author:stark18
