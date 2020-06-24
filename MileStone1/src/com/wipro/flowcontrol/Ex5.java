package com.wipro.flowcontrol;

public class Ex5 {
	static void Charcheck(char input_char)
	{
		if((input_char>=65 && input_char<=90)||(input_char>=97 && input_char<=122))
		{
			System.out.println("Alphabet");
		}
		else if(input_char>=48 && input_char<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
			
	}

	public static void main(String[] args) {
		char input_char='.';
		Charcheck(input_char);
		// TODO Auto-generated method stub

	}

}
