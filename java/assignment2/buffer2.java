package assignment2;
import java.io.*;

public class buffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        try {
		            // Open the file for writing
		            File file = new File("C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\input.txt");
		            FileWriter fileWriter = new FileWriter(file);
		            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		 
		            // Write some text to the file
		            bufferedWriter.write("Hello, world!");
		            bufferedWriter.newLine();
		            bufferedWriter.write("This is a test.");
		            bufferedWriter.newLine();
		 
		            // Close the file
		            bufferedWriter.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
		 

