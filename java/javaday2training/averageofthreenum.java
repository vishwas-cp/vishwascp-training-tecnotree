package javaday2training;
import java.util.Scanner;

public class averageofthreenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the third number: ");
		        double num3 = scanner.nextDouble();

		        double average = (num1 + num2 + num3) / 3;

		        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
		    }
		}


