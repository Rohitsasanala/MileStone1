package com.wipro.flowcontrol;

public class Ex1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a > 0)
		{
			System.out.println("Positive");
		}
		else if(a < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
		if(~(a%10 - 1) == b%10)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
