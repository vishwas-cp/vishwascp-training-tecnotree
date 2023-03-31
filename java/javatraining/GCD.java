/* Find the GCD of two numbers.*/

package javatraining;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=200,n2=50;
		while(n1!=n2) {
			if(n1>n2)
				n1-=n2;
			else
				n2-=n1;
		}
		System.out.println("The GCD of two number is: "+n1);

	}

}
