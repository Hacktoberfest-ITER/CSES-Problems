//Question
//A permutation of integers 1,2,…,n is called
//beautiful if there are no adjacent elements whose difference is 1.
//Given n, construct a beautiful permutation if such a permutation exists.
//https://cses.fi/problemset/task/1070

#include "iostream"

int main(){
    long n;
	std::cin>>n;
	if (n==1){
		printf("1");
	}else if(n<4){
		printf("NO SOLUTION");
	}else if (n==4){
		printf("3 1 4 2");
	}else{
        for (long j = n - 1 ; j >  0; j -= 2){
			printf("%d" , j);
			printf(" ");
		}
		for (long i = n; i > 0; i -= 2){
			printf("%d" ,  i);
			printf(" ");
		}
	}
	return 0;
}

//author : Pratik Sonal
//CSES profile : https://cses.fi/user/34290
//solution : https://cses.fi/problemset/result/1141621/