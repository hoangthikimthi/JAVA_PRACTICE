package java_w3school;

import java.util.Arrays;

public class second_lagest {
	public static void main(String[] args) {

		// Declare and initialize an integer array 'my_array1'.
		int[] my_array1 = { 1, 2, 3, 4, 5 };

		// Print the original array using Arrays.toString() method.
		System.out.println("Original array : " + Arrays.toString(my_array1));

		// Iterate through the first half of the array and reverse its elements.
		for (int i = 0; i < my_array1.length / 2; i++) {
			// Swap the elements at positions 'i' and 'length - i - 1'.
			int temp = my_array1[i];
			my_array1[i] = my_array1[my_array1.length - i - 1];
			my_array1[my_array1.length - i - 1] = temp;
		}

		// Print the reversed array using Arrays.toString() method.
		System.out.println("Reverse array : " + Arrays.toString(my_array1));
	}
}
