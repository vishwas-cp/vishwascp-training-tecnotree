/*program to find the lcm of two numbers.*/

package javatraining;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12,num2=14,hcf=1;
		for(int i=1;i<=num1||i<=num2;i++) {
			if(num1%i==0 && num2%i==0)
				hcf=i;
		}
		int lcm=(num1*num2)/hcf;
		System.out.println("The LCM of "+num1+" and "+num2+" is: "+lcm);

	}

}
