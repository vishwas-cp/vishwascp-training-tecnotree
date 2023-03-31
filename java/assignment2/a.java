package assignment2;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

		if (i % 2 == 0) {

		sum += numbers[i];

		   }

		}

		System.out.println("Sum: " + sum);

	}

}
