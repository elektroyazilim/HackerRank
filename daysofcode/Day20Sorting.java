package daysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class Day20Sorting {

	public static void main(String[] args) {
		// Day 20: Sorting

		Scanner scanner = new Scanner(System.in);
		int sizeOfArray = scanner.nextInt();

		int[] original = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) {
			original[i] = scanner.nextInt();
		}

		// System.out.println(Arrays.toString(original));
		bubbleSort(original);

	}

	public static void bubbleSort(int[] array) {

		int temp = Integer.MIN_VALUE;
		int swapNumber = 0;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {

					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapNumber++;
				}
			}
			

		}
		System.out.println("Array is sorted in " + swapNumber + " swaps.");
		//System.out.println(Arrays.toString(array));
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[array.length - 1]);
	}

}

// https://www.hackerrank.com/rest/contests/master/challenges/30-sorting/download_pdf?language=English
