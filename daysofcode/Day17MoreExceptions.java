package daysofcode;

import java.util.Scanner;

class NegativeError extends Exception {

}

class Calculator {
	public static int power(int power, int number) throws NegativeError {
		if (number < 0 || power < 0) {
			throw new NegativeError();
		}
		return (int) Math.pow(power, number);
	}
}

public class Day17MoreExceptions {

	public static void main(String[] args) {
		// Day 17: More Exceptions
		Scanner scanner = new Scanner(System.in);

		int sizeOfTestcase = scanner.nextInt();

		for (int i = 0; i < sizeOfTestcase; i++) {
			int n = scanner.nextInt();
			int p = scanner.nextInt();
			try {
				System.out.println(Calculator.power(n, p));
			} catch (NegativeError e) {
				System.out.println("n and p should be non-negative");
			}
		}

	}

}

// https://www.hackerrank.com/rest/contests/master/challenges/30-more-exceptions/download_pdf?language=English