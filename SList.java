import java.util.NoSuchElementException;
public class SList<E> {
	protected Node head;
	protected int size;
	public SList() {
		head=null;
		size=0;
	}
	public int getSize() {
		return size;
	}
	public int search(E target) {
		Node p=head;
		for(int i=0;i<size;i++) {
			if(p.getItem()==target)
				return i;
			p=p.getNext();
		}
		return -1;
	}
	public void insertFront(E newItem){
		Node x=new Node(newItem,head);
		head=x;
		size++;
	}
	public void insertAfter(E newItem,Node p){
		p.setNext(new Node(newItem,p.getNext()));
		size++;
	}
	public void deleteFront() {
		if(size==0)
			throw new NoSuchElementException();
		head=head.getNext();
		size--;
	}
	public void deleteAfter(Node p) {
		if(p==null)
			throw new NoSuchElementException();
		Node t=p.getNext();
		if(t!=null) {
			p.setNext(t.getNext());
			t.setNext(null);
			size--;
		}
		else
			;
	}
	//리스트 거꾸로 만들기
	public void reverse() {
		SList temp=new SList();
		int s=this.size;
		for(int i=0;i<s;i++) {
			temp.insertFront(this.head.getItem());
			this.deleteFront();
		}
		this.head=temp.head;
	}
	public void print() {
		Node x=head;
		while(x!=null) {
			System.out.printf(x.getItem()+"\t");
			x=x.getNext();
		}
		System.out.println();
			
	}

}
