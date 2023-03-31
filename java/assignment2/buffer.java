package assignment2;
import java.io.*;

public class buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        try {
		            // Open the file for reading
		            File file = new File("C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\input.txt");
		            FileReader fileReader = new FileReader(file);
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		 
		            // Read the contents of the file line by line
		            String line;
		            while ((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		            }
		 
		            // Close the file
		            bufferedReader.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
