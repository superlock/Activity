package com.activity.Calculator;
import java.util.Scanner;

import com.activity.Calculator.operation.Addition;
import com.activity.Calculator.operation.Division;
import com.activity.Calculator.operation.Multiplication;
import com.activity.Calculator.operation.Subtraction;

import Bean.CalculatorInputBean;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CalculatorInputBean calculatorInputBean = new CalculatorInputBean();
				
		 System.out.print("Enter First number: ");
		 	calculatorInputBean.setFirstNum(in.nextInt());
		 System.out.print("\nEnter Second number: ");
		 	calculatorInputBean.setSecondNum(in.nextInt());
		 final int finalValue = 4;
		 //	finalValue = 5;
		 Operations add = new Addition();
		 Operations subtract = new Subtraction();
		 Operations multiply = new Multiplication();
		 Operations divide = new Division();
		 
		 System.out.println(add.compute(calculatorInputBean.getFirstNum(), calculatorInputBean.getSecondNum()));
		 System.out.println(subtract.compute(calculatorInputBean.getFirstNum(), calculatorInputBean.getSecondNum()));
		 System.out.println(multiply.compute(calculatorInputBean.getFirstNum(), calculatorInputBean.getSecondNum()));
		 System.out.println(divide.compute(calculatorInputBean.getFirstNum(), calculatorInputBean.getSecondNum()));
		 
		 in.close();
	}
}
