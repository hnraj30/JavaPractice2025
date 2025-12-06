package javaBasics;

public class Greet {
	public static void main(String[]args)
	{
		System.out.println("From main method\n");
		
		System.out.println(greet()+"\n");
		temp();
	}
	public static void temp()
	{
		System.out.println("From temp");
	}
	public static String greet()
	{
		String message = "from called method";
		return message;
	}
}
