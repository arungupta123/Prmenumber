package String;

import java.util.Scanner;

public class Countofstring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String alpha=scan.nextLine();
		String m="";
		int index=0;
		for(int i=0;i<alpha.length();i++)
		{
			m=m+alpha.charAt(i);
			index++;
		}
		
		System.out.println(index);

	}

}
