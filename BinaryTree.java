import java.util.*;
public class BinaryTree<Key extends Comparable<Key>> {
	Node<Key> root;
	public BinaryTree() {root=null;}
	public Node getRoot() {return root;}
	public void setRoot(Node<Key> newRoot) {root=newRoot;}
	public boolean isEmpty() {return (root==null);}
	
	public void preorder(Node n) {//전위순회
		if(n!=null) {
			System.out.print(n.getKey()+"\t");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	public void inorder(Node n) {//중위순회
		if(n!=null) {
			inorder(n.getLeft());
			System.out.print(n.getKey()+"\t");
			inorder(n.getRight());
		}
	}
	public void postorder(Node n) {//후위순회
		if(n!=null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey()+"\t");
		}
	}
	public void levelorder(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		Node t;
		q.add(root);
		while(!q.isEmpty()) {
			t=q.remove();
			System.out.print(t.getKey()+"\t");
			if(t.getLeft()!=null) 
				q.add(t.getLeft());
			if(t.getRight()!=null) 
				q.add(t.getRight());			
		}
		
	}
	public int size(Node n) {
		if(n==null)
			return 0;
		else
			return(1+size(n.getLeft())+size(n.getRight()));
	}
	public int height(Node n) {
		if(n==null)
			return 0;
		else
			return(1+Math.max(height(n.getLeft()), height(n.getRight())));
	}
	public static boolean isEqual(Node n,Node m) {
		if(n==null||m==null)
			return n==m;
		if(n.getKey().compareTo(m.getKey())!=0)
			return false;
		return (isEqual(n.getLeft(), m.getLeft())&&isEqual(n.getRight(),m.getRight()));
	}
}