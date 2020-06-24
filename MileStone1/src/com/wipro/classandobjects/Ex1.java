package com.wipro.classandobjects;

	import java.util.Scanner;
	class Box
	{

	double w,h,d;
	Box(double width,double height,double depth)
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return (w*h*d);
	}
	}
	public class Ex1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Width, Height, Depth:");
	double w=sc.nextDouble();
	double h=sc.nextDouble();
	double d=sc.nextDouble();
	Box b1=new Box(w,h,d);
	System.out.println("The volume is:"+(b1.volume()));

	}

	}






