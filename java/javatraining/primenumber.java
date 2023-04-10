/*to print all the first n prime numbers where n will be given as input.*/

package javatraining;
import java.util.Scanner;

public class primenumber {


		    public static boolean isPrime(int num) {
		        /*
		         * Function to check if a number is prime
		         */
		        if (num < 2) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of n: ");
		        int n = scanner.nextInt();
		        scanner.close();

		        int count = 0;
		        int num = 2;
		        while (count < n) {
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		                count++;
		            }
		            num++;
		        }
		    }
		}


	


