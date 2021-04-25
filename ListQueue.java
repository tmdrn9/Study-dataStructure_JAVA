import java.util.*;
public class ListQueue<E> {
	private Node<E> front,rear;
	private int size;
	public ListQueue() {
		size=0;
		front=rear=null;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return(size==0);
	}
	public void add(E newItem) {
		Node newNode=new Node(newItem,null);
		if(isEmpty())
			front=newNode;
		else
			rear.setNext(newNode);
		rear=newNode;
		size++;
	}
	public E remove() {
		if(isEmpty())
			throw new NoSuchElementException();
		E removeItem=front.getItem();
		front=front.getNext();
		size--;
		if (isEmpty())
			rear=null;
		return removeItem;
	}
	
	public void reverse() {
		int cnt=this.size();
		Stack as=new Stack();
		for(int i=0;i<cnt-1;i++) 
			as.push(this.remove());
		for(int j=0;j<cnt-1;j++) 
			this.add((E)as.pop());
	}
	
	public void print() {
		int cnt=0;
		Node out=front;
		while(true) {
			System.out.print(out.getItem()+"\t");
			out=out.getNext();
			cnt++;
			if(cnt==size)
				break;
		}
		System.out.println();
	}
}
