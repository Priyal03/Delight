package com.wals;

public class MakeTree {

	public static void main(String[] args) {

		MakeTree mk = new MakeTree();
		Node root = mk.makeTree();

		System.out.println(mk.size(root));

		System.out.println(mk.max(root));

		System.out.println(mk.min(root));

		mk.inOrder(root);
		System.out.println(" = In order : ");

		mk.preOrder(root);
		System.out.println(" = Pre order : ");

		mk.postOrder(root);
		System.out.println(" = Post order : ");

		mk.levelOrderOuter(root);
		System.out.println(" = Level order : ");
		
//		trees, search, recursion and great focus on dynamic programming.
//		

	}

	private void levelOrderOuter(Node root) {

		int height = getHeight(root);
		
		for (int i=1;i<=height;i++) 
			levelOrder(root, i);

//		for (int i=height;i>0;i--) //height wise traversal
//			levelOrder(root, i);

	}

	public void levelOrder(Node root, int level) {

		if (root == null)
			return;

		if (level == 1)
			System.out.print(root.data + " ");

		else if (level > 1) {
			levelOrder(root.left, level - 1);
			levelOrder(root.right, level - 1);
		}
	}

	public int getHeight(Node root) {

		int height = 0;

		if (root == null)
			return 0;
		else {

			int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);

			height = lHeight >= rHeight ? lHeight + 1 : rHeight + 1;
		}
		return height;
	}

	public void postOrder(Node root) {

		if (root.left != null)
			postOrder(root.left);
		if (root.right != null)
			postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public void preOrder(Node root) {

		System.out.print(root.data + " ");
		if (root.left != null)
			preOrder(root.left); // V is the time taken for all three
		if (root.right != null)
			preOrder(root.right); //
	}

	public void inOrder(Node root) {

		if (root.left != null)
			inOrder(root.left);
		System.out.print(root.data + " ");
		if (root.right != null)
			inOrder(root.right);
	}

	public int min(Node root) {

		int min = 0;

		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public int max(Node root) {

		int max = 0;

		while (root.right != null) {
			max = root.right.data;
			root = root.right;
		}

		return max;
	}

	public int size(Node head) {

		if (head == null)
			return 0;
		else
			return size(head.left) + 1 + size(head.right);
	}

	public Node makeTree() {

		Node head = new Node(5);

		head.left = new Node(3);
		head.right = new Node(7);

		head.left.left = new Node(2);
		head.left.right = new Node(4);

		head.right.left = new Node(6);
		head.right.right = new Node(8);
		head.right.right.right = new Node(10);

		return head;

	}
}
