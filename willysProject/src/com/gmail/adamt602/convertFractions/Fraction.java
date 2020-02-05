package com.gmail.adamt602.convertFractions;

public class Fraction {
	//Global private variables
	private double numerator = 0;
	private double denominator = 0;
	private double newNumerator;
	private double newDenominator;
	private String fraction = null;
	
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
		
		//makes a sub string from the original string and stores it in numerator 
		String numeratorString = Fraction.substring(0, position);
		
		//makes a sub string from the original string and stores it in denominator
		String denominatorString = Fraction.substring(position + 1, Fraction.length());
		
		//converts the strings into double type values 
		setnumerator(Double.parseDouble(numeratorString));
		setdenominator(Double.parseDouble(denominatorString));
		
	}
	
	private String gcdCalculation() {
		int gcd = GCD.gcd((int) getNumerator(), (int)getDenominator());
		setNewNumerator(getNumerator() / gcd);
		System.out.println(gcd);
		setNewDenominator(getDenominator() / gcd);
		return "" + getNewNumerator()+  "/" +  getNewDenominator();
	}
	
	public double getNumerator(){
		//returns the numerator 
		return numerator;
	}
	
	public double getDenominator() {
		//returns the denominator
		return denominator;
	}
	
	public double getNewNumerator() {
		return newNumerator;
	}
	
	public double getNewDenominator() {
		return newDenominator;
	}
	
	public String getFraction() {
		
		return gcdCalculation();
				
	}
	
	public void setnumerator(double numerator) {
		this.numerator = numerator;
	}
	
	public void setdenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public void setNewNumerator(double newNumerator) {
		this.newNumerator = newNumerator;
	}
	
	public void setNewDenominator(double newDenominator) {
		this.newDenominator = newDenominator;
	}
	
	
	
	
	
	

}
