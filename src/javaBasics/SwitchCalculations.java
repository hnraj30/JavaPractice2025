package javaBasics;

import java.util.Scanner;

public class SwitchCalculations {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number\n");
		int num1 = sc.nextInt();
		System.out.println("Enter another number\n");
		int num2 = sc.nextInt();
		
		System.out.println("Enter your choice\n 1-Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Sum of given two numbers = "+(num1+num2));
			}
			break;
			case 2:
			{
				System.out.println("Difference of given two numbers = "+(num1-num2));
			}
			break;
			case 3:
			{
				System.out.println("Multiplication of given two numbers = "+(num1*num2));
			}
			break;
			case 4:
			{
				System.out.println("Division of given two numbers = "+(num1/num2));
			}
			break;
			default:
			{
				System.out.println("Invalid entry");
			}
		}
		
		
		
		
		
		
				
	}

}
