package daysofcode;

import java.util.LinkedList;
import java.util.Scanner;

public class Day15LinkedList {

	public static void main(String[] args) {
		// Day 15: Linked List

		Scanner scanner = new Scanner(System.in);
		int sizeOfList = scanner.nextInt();
		LinkedList<Integer> linklist = new LinkedList<>();
		for (int i = 0; i < sizeOfList; i++) {
			linklist.add(scanner.nextInt());
		}
		//System.out.println(linklist);
		for (Integer item : linklist) {
			System.out.print(item + " ");
		}


	}

}

// https://www.hackerrank.com/rest/contests/master/challenges/30-linked-list/download_pdf?language=English
