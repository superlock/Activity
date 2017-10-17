package com.shadowing.collection;

import java.util.Iterator;
import java.util.List;

public class ThrowCollection {
	public void stress(List<String> list) {
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
