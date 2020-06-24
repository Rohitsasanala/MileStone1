package com.wipro.arrays;

public class Ex3 {
	public static void main(String[] args) {
		int a[];
		System.out.println("enter size of array");
		int n=Integer.parseInt(args[0]);
		System.out.println(n);
		int i,temp=0,flag = 0;
		a = new int[n];
		System.out.println("enter elemets in array");
		 for (i=1;i<=n;i++)
				a[i-1]=Integer.parseInt(args[i]);
		 for (i=0;i<n;i++)
			 System.out.println(a[i]);
		 System.out.println("enter key");
		 int k=Integer.parseInt(args[i+1]);
		 System.out.println(k);
		 for(i=1;i<=n;i++)
		 {
			 if(a[i-1]==k)
			{ 
				 flag = 1;
				 temp = i-1;
				 break;
			 }
		 }
			 if(flag == 1)
			 {
				 System.out.println("Output:"+temp);
				 
			 }
			 else
			 {
				 System.out.println(" Output: -1");
			 }
		
	}

}
