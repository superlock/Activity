package com.shadowing.Arrays;

public class SampleArray {	
	public void intArray() {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void stringArray() {
		String[] arrayOfNumbers = new String[5+1];
		String[] arraySec = new String[5];
		arrayOfNumbers[0] = "Hi";
		arrayOfNumbers[1] = "Hello";
		System.out.println(arrayOfNumbers[0]); //will print Hi
		
		//assign a value to an array using For loop
		for(int x=0; x < 5; x++) {
			arraySec[x] = "Hello";
		}

		
		System.out.println("display array using for each");
		for (String string : arrayOfNumbers) {
			System.out.print(string +", ");
		}
		
		System.out.println("");
		for (String string : arraySec) {
			System.out.print(string+", ");
		}
		
		System.out.println("display array using do-while");
		int x = 0;
		do {
			System.out.print(arrayOfNumbers[x]+", ");
			x++;
		} while (x < 6);
	}
}
