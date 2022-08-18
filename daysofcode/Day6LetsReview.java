package daysofcode;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		// about strings

		Scanner sc = new Scanner(System.in);

		int tcNumber = sc.nextInt(); // testcase number

		if (tcNumber >= 1 && tcNumber <= 10) {
			for (int i = 0; i < tcNumber; i++) {
				String text = sc.next();
				String odd = "", even = "";
				for (int j = 0; j < text.length(); j++) {
					if (j % 2 == 0) // so even
					{
						even += text.charAt(j);
					} else {
						odd += text.charAt(j);

					}
				}
				System.out.print(even + " ");
				System.out.println(odd);
			}

		}
	}

}
