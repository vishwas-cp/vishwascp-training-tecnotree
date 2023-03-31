/*Write a program to reverse a string.*/

package javatraining;

public class reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vishwas";
		String rev=new StringBuilder(name).reverse().toString();
		System.out.println("Before Reverse: "+name);
		System.out.println("After Reverse: "+rev);
	}

}
