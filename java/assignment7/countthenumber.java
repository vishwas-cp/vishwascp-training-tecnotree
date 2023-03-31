package assignment7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        try {
		            // open the file for reading
		            FileReader fileReader = new FileReader("C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\filename.txt");
		          //the text in the filename.txt is Java is based on a object oriented Concepts
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		            
		            // initialize the word count to zero
		            int wordCount = 0;

		            // read each line from the file and count the words
		            String line;
		            while ((line = bufferedReader.readLine()) != null) {
		                String[] words = line.split("\\s+");
		                wordCount += words.length;
		            }

		            // close the file
		            bufferedReader.close();

		            // print out the total number of words
		            System.out.println("Total number of words: " + wordCount);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
