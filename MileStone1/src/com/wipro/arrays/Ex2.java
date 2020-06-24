package com.wipro.arrays;

public class Ex2 {
	public static void main(String[] args) {
		//int a[]  = new int[5];
		int a[] ={18,9,2,5,7};
		int i,min,max=0;
		min = a[0];
		for(i=0;i<a.length;i++)
		{
			if( a[i] > max)
			{
				max = a[i];
			}
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Max value:"+max+"    Min value:"+min);
	}

}
