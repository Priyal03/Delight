package walmart;

public class BinaryTreeToDoublyLinkedList {

	public static void main(String[] args) {

		MakeTree mk=new MakeTree();
		
		Node head = mk.makeTree();
		
		BinaryTreeToDoublyLinkedList obj=new BinaryTreeToDoublyLinkedList();
		
		head = obj.convertOuter(head);
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.right;
		}
	}

	private Node convertOuter(Node head) {
		
		if(head==null)
			return head;
		
		head = makeDLL(head);
		
		while(head.left!=null)
			head=head.left;
		
		return head;
	}

	private Node makeDLL(Node head) {

		if(head==null)
			return head;
		
		if(head.left!=null) { //head is still the root node.
			
			Node prev = makeDLL(head.left); // getting the left most node for Inorder traversal
			
			while(prev.right!=null)
				prev=prev.right;
			
			prev.right=head; //putting the max of left subtree before the root element
			head.left=prev;
			
		}
		
		if(head.right!=null) {
			
			Node next = makeDLL(head.right);
			
			while(next.left!=null){ //getting the minimum element from right subtree
				next=next.left;
			}
			
			head.right=next;
			next.left=head;
		}
		
		return head;
	}
}