package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun maf = new MoreArrayFun();
		maf.printStrings();
		maf.printReverseStrings();
		maf.printEOStrings();
		maf.randomStrings();
		
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printStrings() {
		String[] strings = {"qw", "er", "ty", "ui", "op"};
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		System.out.println("");
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void printReverseStrings() {
		String[] rstrings = {"wq", "re", "yt", "iu", "po"};
		
		for (int i = rstrings.length-1; i >= 0 ; i--) {
			System.out.println(rstrings[i]);
		}
		System.out.println("");
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void printEOStrings() {
		String[] eostrings = {"sdrowgonleraeseht", "thesearelongwords", "t", "tjalskhd"};
		
		for (int i = 0; i < eostrings.length; i+=2) {
			System.out.println(eostrings[i]);
		}
		System.out.println("");
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public void randomStrings() {
		String[] randstrings = {"asdf", "ghjkl", "qwerty", "uiop", "zxcv", "bnm"}; 
		
		Random r = new Random();
		int count = randstrings.length;
		boolean finished = false;
		
		while (!finished) {
			int currentIndex = r.nextInt(randstrings.length);
			if (!randstrings[currentIndex].equals(" ")) {
				System.out.println(randstrings[currentIndex]);
				randstrings[currentIndex] = " ";
				if (--count == 0) {
					finished = true;
				}
			}
		}
		System.out.println("");
	}
}
