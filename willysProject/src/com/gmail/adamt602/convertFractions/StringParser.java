package com.gmail.adamt602.convertFractions;

public class StringParser {
	
	public static void main(String[] args) {
		
		Fraction f = new Fraction("55/43"); 
		
		//Displays the double type values 
		System.out.println("The numerator is: " + f.getnumerator()
		+ "\nThe denominator is: " + f.getdenominator());
		
		//display GCD
		GCD.gcd(3, 6);
	}


}
