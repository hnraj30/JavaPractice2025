package javaBasics;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args)
	{
		System.out.println("Here you can reverse a number");
		System.out.println("Enter a number");
		Scanner read = new Scanner(System.in);
		long number = read.nextLong();
		
		Long reversedNumber = 0L;
		for(long i=number;i>=1;i=i/10)
		{
			//System.out.println(i);
			long temp = i%10;
			reversedNumber = (reversedNumber*10)+temp;
		}
		System.out.println("Reversed number of "+number+" is: "+reversedNumber);
		
		//Checking if a number is palindrome or not
		if(number==reversedNumber)
		{
			System.out.println("Given number is a palindrome");
		}
		else
		{
			System.out.println("Given number is not a palindrome");

		}
	}

}
