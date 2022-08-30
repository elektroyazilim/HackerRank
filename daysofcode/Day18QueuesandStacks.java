package daysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;


class Palindrome {
	public Queue queue;
	public Stack stack;

	public Palindrome() {
		queue = new LinkedList<>();
		stack = new Stack();
	}

	public void pushCharacter(char ch) {
		stack.push(ch);
	}

	public void enqueueCharacter(char ch) {
		queue.add(ch);
	}

	public char popCharacter() {
		return (char) stack.pop();
	}

	public char dequeueCharacter() {
		return (char) queue.remove();
	}
}

public class Day18QueuesandStacks {

	public static void main(String[] args) {
		// Day 18: Queues and Stacks

		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		scanner.close();

		Palindrome p = new Palindrome();

		for (int i = 0; i < word.length(); i++) {
			p.pushCharacter(word.charAt(i));
			p.enqueueCharacter(word.charAt(i));
		}

		int counter = -1;
		for (int i = 0; i < word.length(); i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				System.out.println("The word, " + word + ", is not a palindrome.");
				counter =0;
				break;
			} 
		}
		if (counter ==-1) {
			System.out.println("The word, " + word + ", is a palindrome.");
		}

	}

}

// https://www.hackerrank.com/rest/contests/master/challenges/30-queues-stacks/download_pdf?language=English
