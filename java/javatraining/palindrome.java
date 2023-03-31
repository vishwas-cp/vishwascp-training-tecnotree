/* Check if a given number is palindrome or not. */

package javatraining;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2021,rev=0,rem,temp;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
			
		};
		if(num==rev) {
			System.out.println(num+" Is Palindrome");
			
		}
		else
			System.out.println(num+" Not Palindrome");

	}
}
