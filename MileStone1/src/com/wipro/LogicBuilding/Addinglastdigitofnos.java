package com.wipro.LogicBuilding;
import java.io.*;
import java.util.*;
import java.math.*;

class Addinglastdigitofnos
{
	static int Addingofdigit(int input1,int input2)
	{
		input1=Math.abs(input1%10);
		input2=Math.abs(input2%10);
         return input1+input2;
	}
	public static void main(String args[])
	{
		int input1,input2,sum=0;
		sum=Addingofdigit(367,458);
		System.out.println(sum);
	}
	
		
	
}

