package daysofcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Difference {

	int[] __elements;
	int maximimumDifference = 0;

	public Difference(int[] array) {
		__elements = array;
	}

	void computeDifference() {
		
		ArrayList<Integer> differences = new ArrayList<Integer>();
		
		for (int i = 0; i < __elements.length; i++) {
			
			for (int j = i + 1; j < __elements.length; j++) {
				differences.add(Math.abs(__elements[i] - __elements[j]));
			}
			
		}
		maximimumDifference = Collections.max(differences);
		System.out.println(maximimumDifference);
	}
}

public class Day14Scope {

	public static void main(String[] args) throws IOException {
		// Day 14: Scope
		Scanner scanner = new Scanner(System.in);
        
        int sizeOfNumberAr = scanner.nextInt();
        // System.out.println(sizeOfNumberAr);
        

        int[] arr = new int[sizeOfNumberAr];
        for (int i = 0; i < sizeOfNumberAr; i++) {
            arr[i] = scanner.nextInt();

        }
        scanner.close();

        // System.out.println(Arrays.toString(arr));

        Difference dif = new Difference(arr);
        dif.computeDifference();
	}

}

/*
 * STDIN Function ----- -------- 3 __elements[] size N = 3 1 2 5 __elements =
 * [1, 2, 5]
 */
/*
 * Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.nextLine();
		int sizeOfNumberAr = scanner.nextInt();
		// System.out.println(sizeOfNumberAr);
		scanner.nextLine();

		int[] arr = new int[sizeOfNumberAr];
		for (int i = 0; i < sizeOfNumberAr; i++) {
			arr[i] = scanner.nextInt();

		}
		scanner.nextLine();
		scanner.close();

		// System.out.println(Arrays.toString(arr));

		Difference dif = new Difference(arr);
		dif.computeDifference();
		*/
