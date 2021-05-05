
public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> t1=new BinaryTree<Integer>();
		BinaryTree<Integer> t2=t1;
		Node n=new Node(100,new Node(200,new Node(400,new Node(800,null,null),null),new Node(500,null,null)),new Node(300,new Node(600,null,null),new Node(700,null,null)));
		t1.setRoot(n);
		System.out.println("Ʈ�� ��� �� : "+t1.size(t1.getRoot()));
		System.out.println("Ʈ�� ���� : "+t1.height(t1.getRoot()));
		System.out.print("������ȸ: ");
		t1.preorder(t1.getRoot());
		System.out.print("\n������ȸ: ");
		t1.inorder(t1.getRoot());
		System.out.print("\n������ȸ: ");
		t1.postorder(t1.getRoot());
		System.out.print("\n������ȸ: ");
		t1.levelorder(t1.getRoot());
		System.out.print("\n���ϼ� �˻�: "+t1.isEqual(t1.getRoot(), t2.getRoot()));
	}

}

