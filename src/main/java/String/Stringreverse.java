package String;

import java.util.Scanner;

public class Stringreverse {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String k="";
		for(int i=s.length()-1;i>=0;i--)
		{
			k=k+s.charAt(i);
		}
		System.out.println(k);
		
		}  
}