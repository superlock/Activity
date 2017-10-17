package com.shadowing.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shadowing.Arrays.SampleArray;

public class TestCollection {

	public static void main(String[] args) {
		//This will input and ascend numbers
		AscendingCollection inlist = new AscendingCollection();
		inlist.beginInput();
		
		
		//sample collections and hash maps
		List<String> list = new ArrayList<String>();
		Map map = new HashMap();
		
		map.put("firstname", "Benedict");
		map.put("lastname", "Cumberbatch");

		System.out.println(map.get("firstname"));
		
		list.add("Hi");
		list.add("Hello");
		list.add("Sample");
		
		map.put("list", list);
		
		List newList = (List) map.get("list");
		
		ThrowCollection arrayClass = new ThrowCollection();
		arrayClass.stress(newList);
		newList.iterator();
		
	}
	
}
