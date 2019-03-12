package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderedIntListTest {

	@Test
	void testOrderedIntList() {
		OrderedIntList tList = new OrderedIntList();
		assertNotNull(tList);
	}

	@Test
	void testOrderedIntListInt() {
		OrderedIntList tList = new OrderedIntList(20);
		assertNotNull(tList);
	}

	@Test
	void testInsert() {
		OrderedIntList tList = new OrderedIntList();
		tList.insert(1);
		tList.insert(2);
		tList.insert(3);
		
		assertEquals(3,tList.size());
	}

	@Test
	void testSize() {
		OrderedIntList tList = new OrderedIntList();
		tList.insert(1);
		tList.insert(2);
		tList.insert(3);
		
		assertEquals(3,tList.size());
	}

	@Test
	void testLength() {
		OrderedIntList tList = new OrderedIntList();
		
		assertEquals(10,tList.length());
	}

	@Test
	void testDelete() {
		OrderedIntList tList = new OrderedIntList();
		tList.insert(1);
		tList.insert(2);
		tList.insert(3);
		
		tList.delete(1);
		assertEquals("1   3",tList.toString());
		
	}

	@Test
	void testToString() {
		OrderedIntList tList = new OrderedIntList();
		tList.insert(1);
		tList.insert(2);
		tList.insert(3);
		tList.insert(4);
		tList.insert(5);
		tList.insert(6);
		tList.insert(8);
		tList.insert(9);
		tList.insert(10);
		
		
		assertEquals("1\t2\t3\t4\t5\n"
				   + "6\t7\t8\t9\t10",tList.toString());
	}

}
