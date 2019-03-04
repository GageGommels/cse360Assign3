package cse360assign3;

public class OrderedIntList {

	private int[] orderedIntList; // array
	private int counter; // counter

	OrderedIntList() {
		orderedIntList = new int[10];
	}

	public void insert(int element) {

		//iterating variables
		int j = 0;
		int i = 0;

		//inserts the element to array and checks to make sure that its in the correct location
		for (i = 0; i < counter; i++) {
			if (element <= orderedIntList[i]) {
				if (element == orderedIntList[i]) {
					return;
				}
				break;
			}
			j++;
		}
		//This checks for if the elements are greater than 10
		if (counter == 10) {
			counter = counter - 1;
		}
		
		if (j == 10) {
			j = j - 1;
		}
		

		// move the elements and deletes the last element in the array
		for (i = counter; i > j;) {
			orderedIntList[i] = orderedIntList[--i];
		}
		counter++;
		orderedIntList[j] = element;
		
	}

	//Method to print out the array function
	public void print() {
		for (int i = 0; i < counter; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print(orderedIntList[i] + "\t");
		}
	}
	public int size() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length; i++) {
			if (orderedIntList[i] != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public int length() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length; i++) {
			counter++;
		}
		return counter;
	}
	public void delete(int key) {
		for (int i = 0; i <= orderedIntList.length; i++) {
			if (i == key) {
				orderedIntList[i] = 0;
			}
		}
	}
}

  