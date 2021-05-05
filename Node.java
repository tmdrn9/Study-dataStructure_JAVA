
public class Node<Key extends Comparable<Key>> {
	private Key item;
	private Node<Key> left;
	private Node<Key> right;
	public Node(Key newItem,Node ln,Node rn) {
		item=newItem;
		left=ln;
		right=rn;
	}
	public Key getKey() {return item;}
	public Node<Key> getLeft(){return left;}
	public Node<Key> getRight(){return right;}
	public void setKey(Key newKey) {item=newKey;}
	public void setLeft(Node<Key> ln) {left=ln;}
	public void setRight(Node<Key> rn) {right=rn;}
}
