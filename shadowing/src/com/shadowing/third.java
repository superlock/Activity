package com.shadowing;

public class third {
	
	
	 //static and instance variables
	public String samp;
	public void printSample() {
		System.out.println(first.a);
	}
	
	//trying the overload methods
	String uniqueID;
	public int addNums(int a, int b) {
	return a + b;
	}
	public double addNums(double a, double b) {
	return a + b;
	}
	
	public void setUniqueID(String theID) {
		// lots of validation code, and then:
		uniqueID = theID;
		System.out.println(uniqueID);
	}
	public void setUniqueID(int ssNumber) {
		String numString = "" + ssNumber;
		setUniqueID(numString);
	}
}
