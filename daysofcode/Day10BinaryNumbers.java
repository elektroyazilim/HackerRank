package daysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Day10BinaryNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		/*
		 * Scanner scanner = new Scanner(System.in); 
		 * int num = scanner.nextInt(); // base 10
		 */
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		int division = -1, remainder = -1;
		String result = "";

		while (n >= 2) {
			division = n / 2;
			remainder = n % 2;
			result = remainder + result;
			n = division;

		}
		result = division + result;
		// System.out.println(result);

		String[] strs = result.split("0");

		int max = 0;
		for (String s : strs) {
			if (max < s.length()) {
				max = s.length();
			}
		}
		System.out.println(max);

	}
}

/*
 * int division =-1, remainder = -1; String result = "";
 * 
 * while (num >= 2) { division = num / 2; remainder = num % 2; result =
 * remainder + result; num = division;
 * 
 * } result = division + result; System.out.println(result);
 * 
 * int counter = 1; char wanted = result.charAt(0);
 * 
 * for (int i = 1; i < result.length(); i++) {
 * 
 * if (wanted == result.charAt(i)) { counter++;
 * 
 * 
 * } wanted = result.charAt(i); } System.out.println(counter);
 */
