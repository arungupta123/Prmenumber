package Number;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean n1=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				n1=true;
				break;
			}
		}
		if(!n1)
		
			System.out.print("prime");
		
		else
		
			System.out.print("!prime");
	
			
		
	}
	
}
