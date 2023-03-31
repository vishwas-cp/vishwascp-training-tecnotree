package assignment7;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readcsvfile {

		    public static void main(String[] args) throws IOException {

		        // Prompt the user to enter the number of students and the number of subjects
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of students: ");
		        int numStudents = scanner.nextInt();
		        System.out.print("Enter the number of subjects: ");
		        int numSubjects = scanner.nextInt();

		        // Create a list to store the student grades
		        List<String[]> studentGrades = new ArrayList<>();

		        // Read the student grades from the user and calculate the average grade for each student
		        for (int i = 1; i <= numStudents; i++) {
		            System.out.print("Enter the grades for student " + i + ": ");
		            scanner.nextLine();
		            String name = "Student " + i;
		            String[] grades = scanner.nextLine().split(",");
		            double total = 0;
		            for (String grade : grades) {
		                total += Double.parseDouble(grade);
		            }
		            double average = total / numSubjects;
		            String[] data = {name, String.format("%.2f", average)};
		            studentGrades.add(data);
		        }
		        scanner.close();

		        // Write the student grades to a CSV file
		        FileWriter writer = new FileWriter("C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\student_grades.csv");
		        for (String[] data : studentGrades) {
		            writer.write(String.join(",", data) + "\n");
		        }
		        writer.close();

		        System.out.println("Student grades written to student_grades.csv");

		        // Read the student grades from the CSV file and print them to the console
		        FileReader reader = new FileReader("C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\student_grades.csv");
		        BufferedReader bufferedReader = new BufferedReader(reader);
		        String line;
		        while ((line = bufferedReader.readLine()) != null) {
		            String[] data = line.split(",");
		            System.out.println(data[0] + " - " + data[1]);
		        }
		        bufferedReader.close();
		    }
		}

