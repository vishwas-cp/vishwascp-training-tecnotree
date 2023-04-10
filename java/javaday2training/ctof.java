package javaday2training;
import java.util.Scanner;

public class Ctof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter temperature in Celsius: ");
		        double celsius = scanner.nextDouble();

		        double fahrenheit = (celsius * 9/5) + 32;

		        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
		    }
		}

