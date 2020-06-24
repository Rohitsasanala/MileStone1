package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args) {
		int[ ] a= new int[]{3,7,9,4,1};
		int i,s=0;
		 for (i=0;i<a.length;i++)
		 {
			 s = s+a[i];
		 }
		int Avg =s/a.length;
		System.out.println("sum of array "+s+" and  average of array "+Avg);

	}

}
