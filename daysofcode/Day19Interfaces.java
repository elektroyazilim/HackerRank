package daysofcode;

import java.util.ArrayList;
import java.util.Scanner;

interface AdvancedArithmetic {
	 public abstract int divisorSum(int n);
	 
}

class Calculator implements AdvancedArithmetic{
	public Calculator() {
		System.out.println("I implemented: AdvancedArithmetic");
	}

	
	@Override
	public int divisorSum(int n) {
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			if (n%i ==0) {
				divisor.add(i);
			}
			
		}
		//System.out.println(divisor);
		int sum = 0;
		for (Integer num : divisor) {
			sum+=num;
		}
		return sum;
	}
	
}

public class Day19Interfaces {

	public static void main(String[] args) {
		// Day 19: Interfaces

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		Calculator obj = new Calculator();
		System.out.println(obj.divisorSum(number));

	}
}

// https://www.hackerrank.com/rest/contests/master/challenges/30-interfaces/download_pdf?language=English
