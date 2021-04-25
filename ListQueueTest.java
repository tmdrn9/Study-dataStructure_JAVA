
public class ListQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue <String>lq=new ListQueue<String>();
		lq.add("apple");
		lq.add("orange");
		lq.add("cherry");
		lq.add("pear");
		lq.print();
		lq.remove();	lq.print();
		lq.add("grape");lq.print();
		lq.remove();	lq.print();
		lq.add("lemon");lq.print();
		lq.add("mango");lq.print();
		lq.add("lime");lq.print();
		lq.add("kiwi");lq.print();
		lq.remove();	lq.print();
	}

}
