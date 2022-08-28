package daysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16ExceptionsStringtoInteger {

	public static void main(String[] args) throws IOException {
		// Day 16: Exceptions - String to Integer

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String S = bufferedReader.readLine();

		bufferedReader.close();
		
		try {
		
			int number = Integer.parseInt(S);
			System.out.println(number);
		} catch (Exception e) {
			// it is not  number
			System.out.println("Bad String");
		}

	}

}
