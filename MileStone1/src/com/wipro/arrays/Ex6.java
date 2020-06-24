package com.wipro.arrays;

public class Ex6 {
	public static void main(String[] args) {
		int num[] ={18,9,2,5,7};
		int temp;
		for (int i=0; i<num.length;i++) 
	    {
	        for (int j=i+1;j<num.length;j++) { 
	            if (num[i] > num[j]) 
	            {
	                temp = num[i];
	                num[i] = num[j];
	                num[j] = temp;
	            }
	        }
	    }
		for (int i=0; i<num.length;i++) 
	    {
			System.out.print(num[i]+" ");
	    }
	}
}
