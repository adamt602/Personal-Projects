package com.gmail.adamt602.convertFractions;

public class GCD {
	
	
	//default constructor 
	public GCD() {
		
		
	}
	
	
	
	public static void gcd(int num1, int num2) {
		int gcd = 1;
		
		for(int i = 1; i <= num1 && i<= num2; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
		
	}

}

