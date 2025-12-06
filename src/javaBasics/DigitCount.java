package javaBasics;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number\n");
		long number = read.nextLong();
		int count=0;
		for(long i=number;i>=1;i=i/10)
		{
			count++;
		}
		
		System.out.println("Number of digits="+count);
	}

}
