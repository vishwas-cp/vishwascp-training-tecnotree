//Array students
package javatraining;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] students = new String[2];

		     
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 0; i < students.length; i++) {
		            System.out.println("Enter details for student :" + (i+1) + ":");
		            System.out.print("Name: ");
		            String name = scanner.nextLine();

		            System.out.print("ID: ");
		            String id = scanner.nextLine();



		            students[i] = "Name: " + name + ", ID: " + id;
		        }

		     
		        for (int i = 0; i < students.length; i++) {
		            System.out.println("Details for student #" + (i+1) + ":");
		            System.out.println(students[i]);
		        }
		    }
		}


	


