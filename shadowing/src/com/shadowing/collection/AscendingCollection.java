package com.shadowing.collection;

import java.util.*;

import Bean.CollectionBean;

public class AscendingCollection {
	private int temp =0;
	public void beginInput() {
		Scanner in = new Scanner(System.in);
		CollectionBean inputList = new CollectionBean();
		
		System.out.println("Enter number of items: ");
		int numItem = in.nextInt();	
	 		 	
	 	for (int i = 0; i < numItem; i++) 
	 	{
			 System.out.print("Enter number: ");
			 inputList.setItems(in.nextInt());
		}
	 	
	 	List<Integer> numList = inputList.getItems();
	 	Collections.sort(numList);
	 	Iterator<Integer> itr = numList.iterator();	
	 	if (numList != null) 
	 	{
			while(itr.hasNext()) 
			{
				System.out.println(itr.next());
			}
		}
		
		in.close();
	}

}
