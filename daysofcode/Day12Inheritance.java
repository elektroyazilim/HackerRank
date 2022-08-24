package daysofcode;

import java.util.Scanner;

class Person {

	protected String firstName;
	protected String lastName;
	protected int idNumber;
}

class Student extends Person {

	private int[] scores;

	public Student(String firstName, String lastName, int idNumber, int[] scores) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.scores = scores;
	}

	char calculate() {
		int toplam = 0;
		for (int score : scores) {
			toplam += score;
		}
		float result = toplam / scores.length;

		char letter=' ';
		if (result >= 90 && result <= 100) {
			letter = 'O';
		} else if (result >= 80 && result < 90) {
			letter = 'E';
		} else if (result >= 70 && result < 80) {
			letter = 'A';
		} else if (result >= 55 && result < 70) {
			letter = 'P';
		} else if (result >= 40 && result < 55) {
			letter = 'D';
		} else if (result < 40) {
			letter = 'T';
		}
		return letter;
	}

}

public class Day12Inheritance {

	public static void main(String[] args) {
		// Day 12: Inheritance

		Scanner scanner = new Scanner(System.in);
		
		String firstName = scanner.next();
		String lastName = scanner.next();
		int id = scanner.nextInt();
		
		int numberOfScore = scanner.nextInt();
		
		int[] scores = new int[numberOfScore];
		
		for (int i = 0; i <numberOfScore; i++) {
			scores[i] = scanner.nextInt();
			
		}

		Student student = new Student(lastName, firstName,id, scores);

		System.out.println("Name: " + student.firstName + ", " + student.lastName);
		System.out.println("ID: " + student.idNumber);

		System.out.println("Grade: " + student.calculate());

	}

}

/* other solution
 * String lastFirstId = scanner.nextLine();
		int numberOfScore = scanner.nextInt();
		scanner.nextLine();
		String scoreStr = scanner.nextLine();

		int[] scores = { Integer.parseInt(scoreStr.split(" ")[0]), Integer.parseInt(scoreStr.split(" ")[1]) };

		Student student = new Student(lastFirstId.split(" ")[1], lastFirstId.split(" ")[0],
				Integer.parseInt(lastFirstId.split(" ")[2]), scores);

		System.out.println("Name: " + student.firstName + ", " + student.lastName);
		System.out.println("ID: " + student.idNumber);

		System.out.println("Grade: " + student.calculate());
*/
