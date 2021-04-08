import java.util.*;
public class ArrList<E> {
	private E a[];
	private int size;// 유효한 데이터의 수
	public ArrList() {
		a=(E[])new Object[1];
		size=0;
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		else
			return false;
	}
	public E peek(int k) {
		if(isEmpty()||k>=size)
			throw new NoSuchElementException();
		return a[k];
	}
	public void insertLast(E newItem) {
		if(a.length==size)
			resize(a.length*2);
		a[size++]=newItem;
			
	}
	public void insert(E newItem,int k) {
		if(a.length==size)
			resize(a.length*2);
		for(int i=size-1;i>=k;i--) {
			a[i+1]=a[i];
		}
		a[k]=newItem;
		size++;
	}
	public void insert(E newItem) {
		insertLast(newItem);
	}
	public void resize(int newSize) {
		Object[] k= new Object[newSize];
		for(int i=0;i<size;i++) {
			k[i]=a[i];
		}
		a=(E[])k;
	}
	public E delete(int k) {
		if(isEmpty()||k>=size)
			throw new NoSuchElementException();		
		E item=a[k];
		for(int i=k;i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		if(size>0&&size<=a.length/4)
			resize(a.length/2);
		return item;
	}
	public void print() {
		for(int i=0; i<a.length;i++) {
			if(i<size)
				System.out.printf(a[i]+"\t");
			else
				System.out.printf("null\t");
		}
		System.out.println();
	}
	
}
