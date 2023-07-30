package String;

import java.util.Scanner;

public class Counttheword {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int c=0;
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				
				c++;
				
			}
		}
		System.out.print(c+1);
		
	}

}
