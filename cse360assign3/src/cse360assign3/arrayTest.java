package cse360assign3;

public class arrayTest {
	
	public static void main(String[] args) {
		
		OrderedIntList list = new OrderedIntList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		
		
		list.print();
		
		System.out.println();
		
		System.out.println(list.length());
		System.out.println(list.size());
		
		list.delete(4);
		
		System.out.println();
		
		
		
		list.delete(1);
		list.delete(1);
		
		System.out.println();
		list.print();
		
		System.out.println(list.length());
		System.out.println(list.size());
		
		
	}

}
