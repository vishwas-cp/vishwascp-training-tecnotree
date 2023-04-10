package javaday2training;
import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a character: ");
		        char ch = scanner.next().charAt(0);

		        int asciiValue = ch;

		        System.out.println("The ASCII value of " + ch + " is " + asciiValue);
		    }
		}


