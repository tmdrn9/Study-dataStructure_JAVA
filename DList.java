import java.util.NoSuchElementException;
public class DList<E> {
	protected DNode head,tail;
	protected int size;
	public DList() {
		head=new DNode(null,null,null);
		tail=new DNode(null,head,null);
		head.setNext(tail);
		size=0;
	}
	public void insertBefore(DNode p,E newItem) {
		DNode t=p.getPrevious();
		DNode newNode= new DNode(newItem,t,p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	public void insertAfter(DNode p,E newItem) {
		DNode t=p.getNext();
		DNode newNode=new DNode(newItem,p,t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	public void delete(DNode x) {
		if(size<=0||x==null)
			throw new NoSuchElementException();
		DNode p=x.getPrevious();
		DNode n=x.getNext();
		p.setNext(n);
		n.setPrevious(p);
		size--;
	}
	public void print() {
		DNode x=head.getNext();
		if(size==0) {
			System.out.println("비어있음");
		}
		else {
			while(x.getItem()!=null) {
				System.out.printf(x.getItem()+"\t");
				x=x.getNext();
			}
			System.out.println();
		}	
	}
}
