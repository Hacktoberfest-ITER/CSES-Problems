// Given a string, your task is to generate all different strings that can be created using its characters.

// Link:https://cses.fi/problemset/task/1622/

#include<bits/stdc++.h>
#define ll long long
using namespace std;
int main(){
      string s;
      cin>>s;

     sort(s.begin(),s.end());

      vector<string>v;

      //Storing all permutation of string using stl next_permutation in cpp
     do{

     	v.push_back(s);

	 }while(next_permutation(s.begin(),s.end()));

	    cout<<v.size()<<endl;

	    for(auto str:v){
	    	cout<<str<<endl;
		}

	return 0;
}


//author:stark18
