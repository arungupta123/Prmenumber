package String;

import java.util.Scanner;

public class Removespace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String k="";
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				
				 k=k+s.charAt(i);
				
			}
		}
		System.out.print(k);
		
	}
}