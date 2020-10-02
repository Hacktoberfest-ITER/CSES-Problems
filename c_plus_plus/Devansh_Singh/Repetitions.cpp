#include <bits/stdc++.h>
using namespace std;

typedef long long int ll;

int main(){
	string s;
	cin >> s;
	int c=1;
	for (int i=0;i<s.length()-1;i++){
		int sum=1;
		while (s[i]==s[i+1]){
			sum++;
			i++;
		}
		if (sum>c){
			c=sum;
		}
	}
	cout << c << endl;
	return 0;
}
