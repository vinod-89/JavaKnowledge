package com.ds.tree;

import java.util.*;
import java.util.Map.Entry;

public class HorizontalBTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}

		public static void printHorizontal(Node root, TreeMap<Integer, ArrayList<Integer>> m, int hd) {
			if (root == null)
				return;
			ArrayList<Integer> getEle = m.get(hd);
			if (getEle == null) {
				getEle = new ArrayList<Integer>();
				getEle.add(root.data);
			} else
				getEle.add(root.data);
			m.put(hd, getEle);
			printHorizontal(root.left, m, hd + 1);
			printHorizontal(root.right, m, hd);

		}

		public static void diagonalPrint(Node root) {
			int hd = 0;
			TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<Integer, ArrayList<Integer>>();
			printHorizontal(root, m, hd);
			System.out.println("print diagoanl");
			for (Entry<Integer, ArrayList<Integer>> m1 : m.entrySet()) {

				System.out.println(m1.getValue());
			}

			System.out.println("print sum");

			for (Entry<Integer, ArrayList<Integer>> m1 : m.entrySet()) {
				int sum = 0;
				for (Integer al : m1.getValue()) {
					sum = sum + al;
				}
				System.out.println(sum);

			}

		}

		public static void main(String[] args) {

			Node root = new Node(8);
			root.left = new Node(3);
			root.right = new Node(10);
			root.left.left = new Node(1);
			root.left.right = new Node(6);
			root.right.right = new Node(14);
			root.right.right.left = new Node(13);
			root.left.right.left = new Node(4);
			root.left.right.right = new Node(7);

			diagonalPrint(root);
		}
	}

}
