package assignment2;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		        ArrayList<String> names = new ArrayList<>();

		 
		        names.add("Vishwas");
		        names.add("Sanjana");
		        names.add("Rohan");
		        names.add("Rachana");

		    
		        System.out.println("Original ArrayList: " + names);

		     
		        names.set(1, "Hema");

		     
		        System.out.println("Changed ArrayList: " + names);

		      
		        names.remove(2);

		        System.out.println("Final ArrayList: " + names);
		    }
		}

