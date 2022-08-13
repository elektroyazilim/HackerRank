package daysofcode;

import java.util.Scanner;

public class Day0HelloWorld {

	public static void main(String[] args) {
		/*
		 *  Enter your code here. Read input from STDIN. Print output to STDOUT. Your 
		 * class should be named Solution. 
		 */

		Scanner sc = new Scanner(System.in);
		String userMessage = sc.nextLine(); // "Welcome to 30 Days of Code!"
		sc.close();

		String hello = "Hello, World.";
		System.out.println(hello);
		System.out.println(userMessage);

	}

}
