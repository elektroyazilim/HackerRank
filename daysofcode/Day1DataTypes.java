package daysofcode;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		int i1;
		double d1;

		Scanner scanner = new Scanner(System.in);
		i1 = scanner.nextInt();
		d1 = scanner.nextDouble();
		scanner.nextLine(); // for dummy Enter character
		String s1 = scanner.nextLine();
		scanner.close();

		System.out.println(i1 + (int) i);
		System.out.println(d1 + d);
		System.out.println(s + s1);

	}

}
