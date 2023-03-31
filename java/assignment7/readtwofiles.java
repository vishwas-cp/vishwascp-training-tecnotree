package assignment7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readtwofiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//In file1 and file2 the Content is sanjana
		        String file1 = "C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\file1.txt";
		        String file2 = "C:\\Users\\chandvs\\OneDrive - Tecnotree\\Documents\\Assignment\\file2.txt";
		        boolean identical = true;

		        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
		            String line1 = reader1.readLine();
		            String line2 = reader2.readLine();

		            while (line1 != null && line2 != null) {
		                if (!line1.equals(line2)) {
		                    identical = false;
		                    break;
		                }
		                line1 = reader1.readLine();
		                line2 = reader2.readLine();
		            }

		            if (identical && line1 == null && line2 == null) {
		                System.out.println("The files are identical.");
		            } else {
		                System.out.println("The files are not identical.");
		            }
		        } catch (IOException e) {
		            System.out.println("Error reading files: " + e.getMessage());
		        }
		    }
		}
