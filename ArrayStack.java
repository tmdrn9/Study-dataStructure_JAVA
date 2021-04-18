import java.util.*;
public class ArrayStack<E> {
	private E arr[];
	private int top;
	public ArrayStack() {
		arr=(E[])new Object[1];
		top=-1;
	}
	public int size() {
		return top+1;
	}
	public void resize(int newsize) {
		Object[] temp=new Object[newsize];
		for(int i=0;i<size();i++)
			temp[i]=arr[i];
		arr=(E[])temp;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public E peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return arr[top];
	}
	public void push(E newitem) {
		if(size()==arr.length)
			resize(2*arr.length);
		arr[++top]=newitem;
	}
	public E pop() {
		if(isEmpty())
			throw new EmptyStackException();
		E temp=arr[top];
		arr[top--]=null;
		if(size()>0&&size()<=arr.length/4)
			resize(arr.length/2);
		return temp;
	}
	public void print() {
		for(int i = 0 ; i <size() ; i++) 
			System.out.print(arr[i]+"\t");
		System.out.println();
	}

}