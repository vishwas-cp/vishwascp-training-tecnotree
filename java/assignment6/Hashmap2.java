package assignment6;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        // create a new HashMap object to store the dictionary
		        HashMap<String, String> dictionary = new HashMap<String, String>();

		        // create a new Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);

		        // loop until the user chooses to exit
		        while (true) {
		            // display options to the user
		            System.out.println("Welcome to the dictionary!");
		            System.out.println("1. Look up a word");
		            System.out.println("2. Add a new word and its meaning");
		            System.out.println("3. Exit");
		            System.out.println("Enter your choice: ");

		            // read the user's choice
		            int choice = scanner.nextInt();

		            // look up a word
		            if (choice == 1) {
		                System.out.println("Enter a word to look up: ");
		                String word = scanner.next();
		                if (dictionary.containsKey(word)) {
		                    System.out.println("Meaning: " + dictionary.get(word));
		                } else {
		                    System.out.println("Sorry, that word is not in the dictionary.");
		                }
		            }
		            // add a new word and its meaning
		            else if (choice == 2) {
		                System.out.println("Enter a new word: ");
		                String word = scanner.next();
		                System.out.println("Enter the meaning of the word: ");
		                String meaning = scanner.next();
		                dictionary.put(word, meaning);
		                System.out.println("Word and meaning added to the dictionary.");
		            }
		            // exit the program
		            else if (choice == 3) {
		                System.out.println("Goodbye!");
		                break;
		            }
		            // invalid choice
		            else {
		                System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }
		}
