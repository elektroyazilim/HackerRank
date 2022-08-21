package daysofcode;

import java.util.Scanner;

public class Day9Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int result = 0;
		if (n >= 2 && n <= 12) {
			result = factorial(n);
		}
		System.out.println(result);

	}

	static int factorial(int number) {

		if (number != 0) {
			return number * factorial(number - 1);
		} else {
			return 1;
		}

	}

}
