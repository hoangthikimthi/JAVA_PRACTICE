package java_w3school;

import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		BT_18_second_smallest_element();
	}

	public static void BT_20_convertToArrayList() {
		String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
		Arrays.asList(my_array);

	}

	public static void BT_18_second_smallest_element() {
		int[] my_array = { -1, -1, 1, 1, 4, 5, 6 };

		// Print the original numeric array.
		System.out.println("Original numeric array : " + Arrays.toString(my_array));

		// Sort the array to find the second largest value.
		Arrays.sort(my_array);
		System.out.println("Original numeric array : " + Arrays.toString(my_array));
		// Initialize an index to the last element's index.
		int index = 0;

		while (my_array[index] == my_array[0]) {
			index++;
		}
		// Print the second largest value found.
		System.out.println("Second largest value: " + my_array[index]);

	}

	public static void BT_17_second_largest_element() {
		int[] my_array = { 1, 2, 4, 5, 5 };

		// Print the original numeric array.
		System.out.println("Original numeric array : " + Arrays.toString(my_array));

		// Sort the array to find the second largest value.
		Arrays.sort(my_array);
		System.out.println("Original numeric array : " + Arrays.toString(my_array));
		// Initialize an index to the last element's index.
		int index = my_array.length - 1;

		while (my_array[index] == my_array[my_array.length - 1]) {
			index--;
		}
		// Print the second largest value found.
		System.out.println("Second largest value: " + my_array[index]);

	}

	public static void BT_16_remove_dupplicate_value() {
		// Declare and initialize an integer array 'my_array1'.
		int[] my_array = { 0, 3, -2, 4, 3, 2 };
		int no_unique_elements = my_array.length;
		for (int i = 0; i < no_unique_elements; i++) {
			for (int j = i + 1; j < no_unique_elements; j++) {
				if (my_array[i] == my_array[j]) {
					my_array[j] = my_array[no_unique_elements - 1];
					no_unique_elements--;
					j--;
				}
			}
		}
		int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}

	}

	public static void BT_15_common_beetween() {
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (my_array[i] == my_array[j]) {
					count += 1;
					System.out.println("duplicate value: " + my_array[i]);
				}

			}

		}
		System.out.println("sl trung: " + count);
	}

	public static void BT_14_dupplicate_value_string() {
		// Declare and initialize an integer array 'my_array1'.
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };
		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i].equals(my_array[j])) {
					System.out.println("duplicate value: " + my_array[i]);
				}

			}

		}

	}

	public static void BT_13_dupplicate_value_string() {
		// Declare and initialize an integer array 'my_array1'.
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };
		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i].equals(my_array[j])) {
					System.out.println("duplicate value: " + my_array[i]);
				}

			}

		}

	}

	public static void BT_12_dupplicate_value_interger() {
		// Declare and initialize an integer array 'my_array1'.
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i] == my_array[j]) {
					System.out.println("duplicate value: " + my_array[i] + "va" + my_array[i]);
				}

			}

		}

	}

	public static void BT_11_reverse() {
		// Declare and initialize an integer array 'my_array1'.
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

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

	public static void BT_10_max_min() {
		int[] my_array = { 25, 14, 56, 15, 36 };
		int a = my_array.length;
		System.out.println("Original Array : " + Arrays.toString(my_array));
		Arrays.sort(my_array);
		System.out.println("Sort array 1 : " + Arrays.toString(my_array));
		System.out.println("Sort array2 : " + Arrays.toString(my_array));
		System.out.println("so lon nhat : " + my_array[a - 1]);
	}

	public static void BT_07_remove_special() {
		int[] my_array = { 25, 14, 56, 15, 36 };
		System.out.println("Original Array : " + Arrays.toString(my_array));
		int removeIndex = 3;

		// Loop to remove the element at the specified index.
		for (int i = removeIndex; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}

		// Print the modified array after removing the second element.
		System.out.println("After removing the second element: " + Arrays.toString(my_array));
	}

	public static void BT_06_find_the_index() {
		int[] my_array1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		for (int i = 0; i < my_array1.length; i++) {
			if (my_array1[i] == 25) {
				System.out.println("so thu tu 36 la: " + i);
			}
		}

	}

	public static void BT_01_Array() {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		Arrays.sort(my_array1);
		for (int i : my_array1) {
			System.out.println(i);
		}
		// Declare and initialize a string array.
		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
		Arrays.sort(my_array2);
		for (String i : my_array2) {
			System.out.println(i);
		}
	}

	public static void BT_02_SumValue() {
		int[] my_array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i : my_array1) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void BT_03_Multidimensional_Array() {
		int[][] multiA = new int[10][10];
		for (int i = 0; i < multiA.length; i++) {
			for (int j = 0; j < multiA.length; j++) {
				System.out.printf("%2d", multiA[i][j]);

			}
			// System.out.println();
		}
	}

	public static void BT_04_calculate_average_value() {
		int[] my_array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < my_array1.length; i++) {
			sum = sum + my_array1[i];
		}
		double avr = sum / my_array1.length;
		System.out.println("everage of array is: " + avr);
	}

	public static void BT_05_Test_if_an_array_contains_a_specific_value() {
		int[] my_array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i : my_array1) {
			if (i == 10) {
				System.out.println("This array contain value is 10");
				break;

			}

		}
	}
}
