package com.wipro.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Ex7 {
	public static void main(String args[])
	{
		Scanner vs=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=vs.nextInt();
		
		System.out.println("Enter the Array values:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=vs.nextInt();
		Arrays.sort(a);
		
		size=removeDuplicate(a,size);
		
		
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		
	}

	public static int removeDuplicate(int[] a, int size) {
       int j=0;
		
		for(int i=0;i<size-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		
		a[j++]=a[size-1];
		return j;
	}

}
