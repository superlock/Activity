package com.shadowing;

public class first { // Class Definition
	
	//private static  int firstNum = 2;
	//private int secondNum = 3;
	
	
	//public static void main(String args[]) { //Main method, first
//		first f = new first();
//		System.out.println(firstNum + f.secondNum);
		
	//}
	
	//public void addNumber() {
	//	System.out.println(firstNum + secondNum);
	//}
	
//	 public void pupAge() {
//	      int age;
//	      age = age + 7;
//	      System.out.println("Puppy age is : " + age);
//	   }
//
//	   public static void main(String args[]) {
//	      first test = new first();
//	      test.pupAge();
//	   }
	
	//triangle area
//	  double area;
//	  int height;
//	  int length;
//	public static void main(String[] args) {
//			   int x = 0;
//			   first [] ta = new first[4];
//			    while ( x < 4 ) {
//			    ta[x] = new first();
//			      ta[x].height = (x + 1) * 2;
//			      ta[x].length = x + 4;
//			      ta[x].setArea();
//			      System.out.print("triangle "+x+", area");
//			      System.out.println(" = " + ta[x].area);
//			      x = x + 1;
//			    }
//			    int y = x;
//			    x = 27;
//			    first t5 = ta[2];
//			    ta[2].area = 343;
//			    System.out.print("y = " + y);
//			    System.out.println(", t5 area = "+ t5.area);
//			  }
//			  void setArea() {
//			    area = (height * length) / 2;
//			  }

	
	//			puzzle 
	public static String a = "sample";
	public static void main(String [] args) {
	    second[] obs = new second[6];
	    int y = 1;
	    int x = 0;
	    int result = 0;
	    while (x < 6) {
	      obs[x] = new second();
	      obs[x].ivar = y;
	      y = y * 10;
	      x = x + 1;
	    }
	    x = 6;
	    while (x > 0) {
	      x = x - 1;
	      result = result + obs[x].doStuff(x);
	    }
	    System.out.println("result " + result);
	    
	    
	    
	    
	    //static and instance variables this is connected to the third.java class
	    /**OTHER CLASS
	    public String samp;
		
		public void printSample() {
			System.out.println(first.a);
		} */
	    third th = new third();
	   	th.samp = "yes naman";
	   	System.out.println(th.samp);
	   	th.printSample();
	   	
	   	//trying the overload methods
	   	System.out.println(th.addNums(1, 2));
	   	System.out.println(th.addNums(1.2, 2.4));
	   	th.setUniqueID(1234);
	   	
	  }
			
}
