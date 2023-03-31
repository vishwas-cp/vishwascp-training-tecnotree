/* program to print all the elements of the Fibonacci series. */

package javatraining;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		int a=0,b=1;
		System.out.print(a+","+b+",");
		int temp;
		for(int i=2;i<num;i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+",");
		}
	}

}
