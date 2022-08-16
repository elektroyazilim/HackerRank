package daysofcode;

// Day4ClassvsInstance.java
public class Person {
	int age;

	public Person(int initialAge) {
		// TODO Auto-generated constructor stub
		if (initialAge < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		} else {
			age = initialAge;
		}
	}

	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} 
		else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} 
		else {
			System.out.println("You are old.");
		}
	}

}
