package com.class5;

import java.util.Scanner;

public class Racap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner anyVariableName;
		
		anyVariableName=new Scanner (System.in);
		
		//to capture entire sentence.
		
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		//to capture a number
		
		int num=anyVariableName.nextInt();
		System.out.println(num);
		
		//to capture double
		double d=anyVariableName.nextDouble();
		System.out.println(d);
		
		//to capture single character
		char singleChar=anyVariableName.next().charAt(0);
	    System.out.println(singleChar);
	}

}
