package assignment7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readandcreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//In the input file content is Lakshimi and Sahana are my best friends
		        String inputFile = "C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\input.txt";
		        String outputFile = "C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\output.txt"; 
//After removing vowels in output file content is Lkshm nd Shn r my bst frnds

		        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
		            String line = reader.readLine();

		            while (line != null) {
		                String newLine = line.replaceAll("[aeiouAEIOU]", "");
		                writer.write(newLine);
		                writer.newLine();
		                line = reader.readLine();
		            }

		            System.out.println("Vowels removed from " + inputFile + " and saved to " + outputFile);
		        } catch (IOException e) {
		            System.out.println("Error reading or writing files: " + e.getMessage());
		        }
		    }
		}

