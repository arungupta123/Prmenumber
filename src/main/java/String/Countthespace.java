package String;

import java.util.Scanner;

public class Countthespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.print(c);
		
	}

}
