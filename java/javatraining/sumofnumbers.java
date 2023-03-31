package javatraining;
/* Calculator program using switch case */
import java.util.Scanner;
 
public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num1");
		int b=in.nextInt();
		
		System.out.println("Enter the num2");
		int c=in.nextInt();
		
		int d;
		System.out.println("1.add 2.sub 3.div 4.mul");
		int a=in.nextInt();
		
		switch(a) {
		case 1: d=b+c;
				System.out.println(d);
				break;
		case 2:d=b-c;
				System.out.println(d);
				break;
		case 3:d=b/c;
				System.out.println(d);
				break;
		case 4:d=b*c;
				System.out.println(d);
				break;
		default:System.out.println("Enter a valid choice");
		}
		

	}

}
