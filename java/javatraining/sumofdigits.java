/*Calculate the sum of digits of a given number.*/

package javatraining;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456789,sum=0;
		int n1=n;
		while(n1!=0) {
			sum+=n1%10;
			n1=n1/10;
		}
		System.out.println("Sum of Digits "+n+" is: "+sum);

	}

}
