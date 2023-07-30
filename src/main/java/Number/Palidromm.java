package Number;

import java.util.Scanner;

public class Palidromm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String reverse="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
	
			System.out.print("palidrom");
	
		else
	
			System.out.print("!palidrom");
	
		
	}

}
