package com.wipro.Strings;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			String str,rev="";
			System.out.println("Enter A String");
			str=sc.nextLine();
			int len=str.length();
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			if(str.contentEquals(rev))
			{
				System.out.println(str+" is a Palindrome");
			}
			else
			{
				System.out.println(str+" is a Not a Palindrome");
			}
					
			
			
			
			
		
		

	}

}
