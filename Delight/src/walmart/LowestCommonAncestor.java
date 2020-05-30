package walmart;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MakeTree mk=new MakeTree();
		
		Node head = mk.makeTree();
		
		LowestCommonAncestor lca = new LowestCommonAncestor();
		
		Node ancestor = lca.getBinaryTreeLCA(head, head.left.left, head.left.right);
		
		System.out.println(ancestor.data);
	}
//take the height of tree, and save the route followed 
	private Node getBinaryTreeLCA(Node root, Node one, Node two) {

		MakeTree mk=new MakeTree();
		int h=mk.getHeight(root);
		
		int arr[]=findElement(root, one, h);
		int arry[]=new int[h];
		
		if(root.data!=one.data || root.data!=two.data) {
			
		}
		
		for(int i=0;i<h;i++) {
			
			arr[i]=root.data;
			
			
		}
		
		return null;
	}
	private int[] findElement(Node root, Node one, int h) {

		int arry[]=new int[h];
		
		if(root==null) {
			return null;
		}
		
		if(root.left.data!=one.data)
		return null;
		return arry;
	}
}
