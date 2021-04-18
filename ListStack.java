import java.util.*;
public class ListStack<E> {
	private Node<E> top;
	private int size;
	public ListStack() {
		top=null;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return(size==0);
	}
	public E peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return top.getItem();
	}
	public void push(E newitem) {
		Node newNode=new Node(newitem,top);
		top=newNode;
		size++;
		
	}
	public E pop() {
		if(isEmpty())
			throw new EmptyStackException();
		E topItem=top.getItem();
		top=top.getNext();
		size--;
		return topItem;
	}
	public void print() {
		Node temp=top;
		for(int i = 0 ; i <size() ; i++) {
			System.out.print(temp.getItem()+"\t");
			temp=temp.getNext();
		}
		System.out.println();
	}

}
