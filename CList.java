import java.util.NoSuchElementException;
public class CList<E> {
	protected Node last;
	protected int size;
	public CList() {
		last=null;
		size=0;
	}
	public int getSize() {
		return size;
	}
	public void insert(E newItem){
		last=new Node(newItem,last);
		size++;
	}
	public Node delete() {
		if(size==0||last==null)
			throw new NoSuchElementException();
		Node x=last.getNext();
		if(x==last)
			last=null;
		else {
			last.setItem(x.getItem());
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}
	public void print() {
		Node x=last;
		if(size==0) {
			System.out.println("비어있음");
		}
		else {
			for(int i=0;i<size;i++){
				System.out.printf(x.getItem()+"\t");
				x=x.getNext();
			}
			System.out.println();
		}	
	}

}
