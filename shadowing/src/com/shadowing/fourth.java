package com.shadowing;

public class fourth {
	private int a,b;
	public static void main(String[] args) {
		fourth four = new fourth();
		
		four.breakContinue();
	}

	public void conditional() {
		a=1;
		b=(a==1)?20:30;
		System.out.println("Value of b is: " +b);
		b=(a==10)?20:30;
		System.out.println("Value of b is: " +b);
	}
	
	public void logical() {
		a = 1;
		b=2;
		if(a==1&&b==1)
			System.out.println("Value of a=1 and b=1");
		else if(a==1||b==1)
			System.out.println("Value of either of a and b is 1");
	}
	
	public void breakContinue() {
		for(int i=0;i<10;i++)
	    {

	        if (i==4)
	        {
	            continue;
	        }
	        System.out.print(i+"\t");
	    }System.out.println();
		for(int i=0;i<10;i++)
	    {
	        if (i==4)
	        {
	            break;
	        }
	        System.out.print(i+"\t");
	    }
	}
	
	public void prePost() {
		int i=6;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
	}
}
