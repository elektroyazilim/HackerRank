package daysofcode;

import java.util.Scanner;

public class Day21Generics {

	public static void main(String[] args) {
		// Day 21: Generics

		Scanner scanner = new Scanner(System.in);
		
		int sizeOfArray = scanner.nextInt();
		
		Integer[] arr = new Integer[sizeOfArray];
		
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = scanner.nextInt();
		}
		
		printArray(arr);
		
		sizeOfArray = scanner.nextInt();
		
		String[] strs = new String[sizeOfArray];
		
		for (int i = 0; i < sizeOfArray; i++) {
			strs[i] = scanner.next();
		}
		
		printArray(strs);
		
	}
	
	public static <E> void printArray(E[] array)
	{
		for (E e : array) {
			System.out.println(e);
		}
	}
	// printArray

}
// https://www.hackerrank.com/rest/contests/master/challenges/30-generics/download_pdf?language=English

