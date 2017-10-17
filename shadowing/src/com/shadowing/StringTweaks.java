package com.shadowing;

public class StringTweaks {
	private String fString="first string";
	private String sString=new String("second STRING");
	private String intVal = String.valueOf(10000);
	private String doubleVal = String.valueOf(10.2/3.4);
	private String tweak1 = "Benedict Cumberbatch", tweak2 = "Martin Freeman", tweak3 = "You just see but do not observe";
	
	public static void main(String[] args) {
		StringTweaks cs = new StringTweaks();
		//cs.doString();
		//cs.manipulateString();
		//cs.stringBuffer();
		//System.out.println(cs.convertString());
		//System.out.println(cs.compareString());
		//cs.returnChar();
		//System.out.println(cs.containString());
		cs.splitString();
	}

	public boolean compareString() {
		//If the twos strings are equal, it will return 'true' else it will return 'false'
		return tweak1.equals(tweak2);
	}
	
	public void splitString() {
		//It breaks the string in to two parts from the passed argument and store it in to array
	   	String [] aSplit = tweak3.split("but");
	   	System.out.println("The first part of the array is : " + aSplit[0]);
	   	System.out.println("The last part of the array is : " + aSplit[1]);
	}
	
	public boolean containString() {
	//This would return 'true' if the passed string is contained in the another String
		return tweak2.contains("Freeman");
	}
	
	
	public void returnChar() {
		//This would return the single character at index value from the String
		System.out.println(tweak1.charAt(5));
		//This would return the sub string from first index to end index
		System.out.println(tweak2.substring(3, 7));
	}
	
	public void doString() {
		System.out.println(fString+sString);
	}
	
	public void manipulateString() {
		System.out.println(fString.toUpperCase());
		System.out.println(sString.toLowerCase());
		System.out.println(intVal);
		System.out.println(doubleVal);
	}
	
	public void stringBuffer() {
		StringBuffer sb= new StringBuffer("String buffer objects");
		sb.insert(1, "Test "); //this will change the string
		System.out.println(sb);
	}
	
	public int convertString() {
		//convert String number into integer
	    return Integer.parseInt("1");
	}
	
}
