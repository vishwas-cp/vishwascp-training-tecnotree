/*  Program to swap two numbers */


package javatraining;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=70;
		System.out.println("First Number = "+a);
		System.out.println("Second number = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping...");
		System.out.println("First number = "+a);
		System.out.println("Second number = "+b);

	}

}
