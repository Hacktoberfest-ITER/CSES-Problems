//Your task is to calculate the number of trailing zeros in the factorial n!.
//
//For example, 20!=2432902008176640000 and it has 4 trailing zeros.

//author:ankitsaebby

import java.util.*; 

public class ankitsaebbyTrailingZeros {
	
	 public static void main (String[] args)  
		 { 
		 	Scanner s=new Scanner(System.in);
		    int n = s.nextInt(); 
		    System.out.println( findTrailingZeros(n)); 
		 } 
	 public static int findTrailingZeros(int n) 
		 { 
		     
		     int count = 0;
		     for (int i = 5; n / i >= 1; i *= 5) 
		         count += n / i; 
	
		     return count; 
		 } 
} 



//cses id-  https://cses.fi/user/32538
