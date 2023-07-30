package String;

import java.util.Scanner;

public class Printthevowel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String m="";
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
					||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				m=m+s.charAt(i);
			}
		}
		System.out.print(m);
	}

}

