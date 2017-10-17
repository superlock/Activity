package com.shadowing.Arrays;

import java.util.Scanner;


public class AscendingArray {

	public void ascend(){
		Scanner in = new Scanner(System.in);
		
		int[] num;
		int temp = 0 ;
		
		 System.out.print("Enter number of items: ");
		 	num = new int[in.nextInt()];
		 	
		 for (int i = 0; i < num.length; i++) {
			 System.out.print("Enter number: ");
			 num[i] = in.nextInt();
		 }
		 
		 for (int y = 0; y < num.length; y++) {
			 for (int i = 0; i < num.length - 1; i++) {
					if(num[i] > num[i+1])
					{
						temp  = num[i];
						num[i] = num[i+1];
						num[i + 1] = temp;
					}
			}
		}
		 
		 
		 for (int ascend: num) {
	         System.out.println(ascend);
	      }
		 
		 in.close();
	}
	

}
