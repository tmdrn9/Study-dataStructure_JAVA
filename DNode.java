
public class DNode<E> {
	protected E item;
	private DNode previous;
	private DNode next;
	public DNode(E newItem, DNode p,DNode n) {
		item=newItem;
		previous=p;
		next=n;
	}
	
	public E getItem() {
		return item;
	}
	public DNode getPrevious(){
		return previous;
	}
	public DNode getNext(){
		return next;
	}
	public void setItem(E newItem) {
		item=newItem;
	}
	public void setPrevious(DNode node){
		previous=node;
	}
	public void setNext(DNode node) {
		next=node;
	}

}
