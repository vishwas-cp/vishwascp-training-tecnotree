/* program to find whether a number is an Armstrong number or not.*/

package javatraining;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();

		        int sum = 0;
		        int temp = num;

		        while (temp > 0) {
		            int digit = temp % 10;
		            sum += (digit * digit * digit);
		            temp /= 10;
		        }

		        if (num == sum) {
		            System.out.println(num + " is an Armstrong number.");
		        } else {
		            System.out.println(num + " is not an Armstrong number.");
		        }
		    }
		}


	


