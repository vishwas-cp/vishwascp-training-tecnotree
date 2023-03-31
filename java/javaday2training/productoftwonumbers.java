package javaday2training;
import java.util.Scanner;

public class productoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        int product = num1 * num2;

		        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
		    }
		}

