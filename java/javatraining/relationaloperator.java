package javatraining;

import java.util.Scanner;

public class relationaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the Frist Numer:");
		n1= in.nextInt();
//		System.out.println("Enter the second Number:");
//		n2=in.nextInt();
		if(n1>0) {
			System.out.println(n1+" +ve ");
		}else if (n1<0) {
			System.out.println(n1+" - ve");
		}
//		else 
//			System.out.println(n1+" Is equal "+n2);
		

	}

}
