package javaBasics;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[]args)
	{
		System.out.println("here you can check given numbver is a prime number or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number\n");
		int number = sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Given number is a prime number\n");
		}
		else
		{
			System.out.println("Given number is not a prime number\n");
		}
	}

}
