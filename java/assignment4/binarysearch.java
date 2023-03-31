package assignment4;
import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        // create an array of strings
		        String[] stringArray = {"Vishwas", "Rachana", "Sanjana", "Hema", "Rohan"};

		        // sort the array in ascending order using Arrays.sort()
		        Arrays.sort(stringArray);

		        // use binarySearch() to find the index of "date" in the array
		        int index = Arrays.binarySearch(stringArray, "Sanjana");

		        // print out the index of "date" in the array
		        System.out.println("Index of "+stringArray[3]+" in the array: " + index);
		    }
		}
