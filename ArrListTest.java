
public class ArrListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrList<String> s = new ArrList<String>();
		s.insert("apple");		s.print();		s.insert("orange");		s.print();    
		s.insert("cherry");		s.print();		s.insert("pear");		s.print();
		s.insert("grape",1);	s.print();		s.insert("lemon",4);		s.print();    
		s.insert("kiwi");		s.print();   
		s.delete(4);		s.print();		s.delete(0);		s.print();
		s.delete(0);		s.print();		s.delete(3);		s.print();
		s.delete(0);		s.print();
		
		System.out.println("1번째 항목은 "+s.peek(1)+"이다.");
		System.out.println();
	}

}
