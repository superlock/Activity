package Bean;

import java.util.*;

public class CollectionBean {
	private List<Integer> numberList = new ArrayList<Integer>();
	
	public List<Integer> getItems() {
		return numberList;
	}
	
	public void setItems(int numList) {
		numberList.add(numList);
	}
}
