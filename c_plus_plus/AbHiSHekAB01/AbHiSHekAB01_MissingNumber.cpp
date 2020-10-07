//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

//author:AbHiSHekAB01

#include<iostream>
#include<vector>
#include<algorithm>
#include<set>

using namespace std;

int main()
{	int x=0,b=0;                                      
	vector<int> a;                                                    
    vector<int>::iterator it;
 
  cin>>x;
   
   for(int n=0;n<x-1;++n)                                                
     { 
		cin>>b;                                                        
   	    a.push_back(b);
     } 

   	sort(a.begin(),a.end());                                       
   	
  	
   	for(it=a.begin();it!=a.end();++it)
   	{
   		if(*it==2 && a.size()==1)
   		cout<<"1";
   		else
   		 if(*it+1!=*(it+1))
   		{   		
		   	cout<<*it+1;
   		    break;
   		    
		}
		 
		
	 
	 	
   		
	}
 return 0;	
}


//cses user id- https://cses.fi/user/32825