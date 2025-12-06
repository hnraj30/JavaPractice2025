package javaBasics;

import java.util.Scanner;

public class Area {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Here you can find area of a circle or a rectangle");
		System.out.println("Enter your choice\n 1-Area of circle\n 2-Area of a rectangle");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case(1):
		{
			System.out.println("Enter radius of circle");
			float radius = sc.nextFloat();
			System.out.println("Area of circle: "+area(radius));
		break;
		}
		
		case(2):
		{
			System.out.println("Enter length of rectangle");
			float length = sc.nextFloat();
			System.out.println("Enter breadth of rectangle");
			float breadth = sc.nextFloat();
			System.out.println("Area of rectangle: "+areaOfRectangle(length,breadth));
		break;
		}
		default:
		{
			System.out.println("Invalid entry");
		}
		
		}
		
		
		
	}
	public static double area(float r)
	{
		//System.out.println("Area of circle="+3.142*r*r);
		double area = 3.142*r*r;
		return area;
	}
	
	public static double areaOfRectangle(float l,float b)
	{
		//System.out.println("Area of rectangle="+l*b);
		double area = l*b;
		return area;
	}
}
