
//Given a string, your task is to reorder its letters in such a way that it becomes a palindrome (i.e., it reads the same forwards and backwards).

//Link :https://cses.fi/problemset/task/1755

#include<bits/stdc++.h>
using namespace std;
int main(){
	
	string s;
	cin>>s;
   
   // Storing frequency of each character in the string	
	int f[26]={};
	for(char c:s){
		++f[c-'A'];			
	}
 
  int c1=0;
	for(int i=0;i<26;i++){
		c1+=f[i]&1;      //Counting odd occurance of characters
	}
	if(c1>1){
	cout<<"NO SOLUTION"<<endl;
	return 0;
	}
	
	string t;
	for(int i=0;i<26;i++){
		if(f[i]&1^1){           //Counting even occurances of character
			for(int j=0;j<f[i]/2;j++)
			t+=(char)('A'+i);
		}
	}
	cout<<t;
	
	for(int i=0;i<26;i++){
		if(f[i]&1){
			for(int j=0;j<f[i];j++)
			   cout<<(char)('A'+i);
		}
	}
	reverse(t.begin(),t.end());
	cout<<t;
	
	
	
	return 0;
}

/*author :stark18 */
