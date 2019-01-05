package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "z";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "q";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 7. make an array of 50 integers
		int[] ints = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < ints.length; i++) {
			int rand = new Random().nextInt(10000);
			ints[i] = rand;
		}
		System.out.println("");
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallestnum = 10001;

		for (int i = 0; i < ints.length; i++) {
			if (ints[i] < smallestnum) {
				smallestnum = ints[i];
			}
		}

		System.out.println("Smallest #: " + smallestnum);
		System.out.println("");
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		System.out.println("");
		// 11. print the largest number in the array.
		int largestnum = 0;

		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > largestnum) {
				largestnum = ints[i];
			}
		}

		System.out.println("Largest #: " + largestnum);
		System.out.println("");
		// 12. print only the last element in the array
		System.out.println("Last #: " + ints[49]);
	}
}
