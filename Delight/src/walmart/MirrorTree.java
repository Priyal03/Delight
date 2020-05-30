package walmart;

public class MirrorTree {

	public static void main(String[] args) {
		
		MakeTree mk=new MakeTree();
		
		Node head = mk.makeTree();
		
		MirrorTree mt=new MirrorTree();
		
		head = mt.createMirror(head);
		
		mk.inOrder(head);
	}
		
	//make left subtree the right one and rightsubtree the left one
	private Node createMirror(Node root) {
		
		Node leftSubtree=null, rightSubtree = null;
		
		if(root.left!=null)
			leftSubtree = createMirror(root.left); 
		
		if(root.right!=null)
			rightSubtree  = createMirror(root.right);
		
		root.left=rightSubtree;
		root.right=leftSubtree;
				
		return root;
	}
}
