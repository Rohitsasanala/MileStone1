package com.wipro.flowcontrol;

public class Ex16 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int d,s=0;
		while(n!='\0')
		{
			d=n%10;
			s=(s*10)+d;
			n=n/10;
		}
		System.out.println(s);

	}
	

}
