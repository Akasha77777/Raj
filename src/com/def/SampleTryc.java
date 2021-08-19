package com.def;
import java.util.Scanner;
//import java.util.A


public class SampleTryc {
	public static void main(String args[])
	{
		/*System.out.println("Main Method Started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scan.nextInt();
		System.out.println("Enter the another number");
		int y=scan.nextInt();
		try {
			int z=x/y;
			System.out.println(z);
		}catch(ArithmeticException e)
		{
			System.out.println("Number can't be divided by zero");
			System.out.println("Main method ended");
		}
		
	}*/
		System.out.println("Main method Started");
		int[] a=new int[2];
		a[0]=10;
		a[1]=20;
		try {
			//a[2]=30;//create object 
			a[2]=a[1]/a[0];
			System.out.println(a[2]);
			
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array is out of range");
		}
		System.out.println("Main method ended");
		
	}

}
