package javaBasics;

public class Practice extends Greet {
	static int a=10;
	public static void main(String[]args)
	{		
		String name1="Impetus Infotech";
		System.out.println(name1.charAt(1));
		
		char[] name = name1.toCharArray();
		for(int i=0;i<name.length;i++)
		{
		int count=1;
		for(int j=i+1;j<name.length;j++)
		{
			if(name1.charAt(i)==name1.charAt(j))
			{
			count++;
			}
		}

		System.out.println(name[i]+"="+count);

			
		}


	}

}
