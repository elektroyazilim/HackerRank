package daysofcode;

import java.util.Scanner;



class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22BinarySearchTrees {

	public static void main(String[] args) {
		// Day 22: Binary Search Trees
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);

	}

	public static int getHeight(Node root) {
		if (root == null)
			return -1;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node current;
			if (data <= root.data) {
				current = insert(root.left, data);
				root.left = current;
			} else {
				current = insert(root.right, data);
				root.right = current;
			}
			return root;
		}
	}

}

// https://www.hackerrank.com/rest/contests/master/challenges/30-binary-search-trees/download_pdf?language=English

/*

Sample Input

7
3
5
2
1
4
6
7
Sample Output

3
*/