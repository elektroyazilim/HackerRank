package daysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesandMaps {

	public static void main(String[] args) {
		// Day 8: Dictionaries and Maps

		Map<String, String> phoneBook = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		int numberOfItem = sc.nextInt();
		sc.nextLine(); // for dummy Enter

		String keyValue = "";
		for (int i = 0; i < numberOfItem; i++) {
			keyValue = sc.nextLine();
			phoneBook.put(keyValue.split(" ")[0], keyValue.split(" ")[1]);

		}
		// System.out.println(phoneList);

		while(sc.hasNext()) {
			keyValue = sc.next();
			Boolean isExist = phoneBook.containsKey(keyValue);
			if (isExist) {
				System.out.println(keyValue + "=" + phoneBook.get(keyValue));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}

}
