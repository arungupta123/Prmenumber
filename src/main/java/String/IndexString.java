package String;

import java.util.Scanner;

public class IndexString {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String a=scan.nextLine();
	
	 for(int i = 0; i < a.length(); i++){  
         System.out.println(a.charAt(i) + "---->"+i); 
          
	 }
	}
	
}
