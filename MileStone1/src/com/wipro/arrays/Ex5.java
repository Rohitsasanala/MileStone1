package com.wipro.arrays;

public class Ex5 {
	public static void main(String[] args) {
		int a[] ={18,9,2,5,7};
		int i,min1,min2;
		int max1=a[0];
		int max2=a[1];
		min1 = a[0];
		min2 = a[0];
		for(i=0;i<a.length;i++)
		{
			if( a[i] > max1)
			{
				max1 = a[i];
			}
			if( a[i] > max2 && a[i]!=max1)
			{
				max2 = a[i];
			}
			if(a[i] < min1)
			{
			    min1 = a[i];
			}
			if(a[i] < min2 && a[i]!=min1)
			{
				min2 = a[i];
			}
		}
		System.out.println("Max value:"+max1+","+max2+"    Min value:"+min1+","+min2);
	}

}
