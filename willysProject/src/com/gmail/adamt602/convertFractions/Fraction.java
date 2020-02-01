package com.gmail.adamt602.convertFractions;

public class Fraction {
	//Global private variables
	private double newNumerator = 0;
	private double newDenominator = 0;
	
	
	//default constructor 
	public Fraction() {
		
	}

	//constructor
	public Fraction(String improperFraction) {
		setString(improperFraction);
		
	}
	
	private void setString(String Fraction) {
		//Creates a reference variable to the string "53/48"
		
		
		//Finds position of the /
		int position = Fraction.indexOf("/");
		
		//Prints the position of /
		System.out.println(position);
		
		//makes a sub string from the original string and stores it in numerator 
		String numerator = Fraction.substring(0, position);
		
		//makes a sub string from the original string and stores it in denominator
		String denominator = Fraction.substring(position + 1, Fraction.length());
		
		//converts the strings into double type values 
		newNumerator = Double.parseDouble(numerator);
		newNumerator = Double.parseDouble(denominator);
		
		
		
	}
	
	public double getnumerator(){
		//returns the numerator 
		return newNumerator;
	}
	
	public double getdenominator() {
		//returns the denominator
		return newNumerator;
	}
	
	

}
