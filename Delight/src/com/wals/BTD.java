package com.wals;

public class BTD {
	
}
/**
	public static void main(String[] args) {
		MakeTree mk=new MakeTree();
		
		Node head = mk.makeTree();
		
		BTD mt=new BTD();
		
		head = mt.convert(head);
		
		mk.inOrder(head);
	} 
	//what can I put in for 

	private Node convert(Node head) {
		
		if(head==null)
			return head;
		
		head=convertMore(head);
		
		while(head.left!=null)
			head=head.left;
		
		return head;
	}

	private Node convertMore(Node head) {
		
		if(head==null)
			return head;
		
		Node left = null ;
		if(head.left!=null) 
			left= convertMore(head.left);
		
		while(left.right!=null) {
			left=left.right;
		}
			head.left=left;
			left.right=head;
		
			Node right=null;
		if(head.right!=null) 
			 right = convertMore(head.right);
		
			head.right=right;
			right.left=head;
		
		return head;
	}
// how would we generate on this? 
	
}
**/