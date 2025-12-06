package javaBasics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Here you can find the factorial of a given number\n");
		System.out.println("Enter a number\n");
		int number = read.nextInt();
		int factorial = 1;
		
		for(int i=1;i<=number;i++)
		{
			factorial = factorial*i;
			
		}
		System.out.println("Factorial of "+number+" = "+factorial);
	}

}
