package javaBasics;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter starting of a number range\n");
		int start = read.nextInt();
		System.out.println("Enter starting of a number range\n");
		int end = read.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			//Check number is a prime number or not
			if(isPrime(i)==2)
			{
				System.out.print(i+"	");
			}
				
		}
	}
	public static int isPrime(int num)
	{
		int count=0;
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
				{
				count++;
				}
		}
		return count;
	}
}




