package cse360assign3;

public class OrderedIntList {

	private int[] orderedIntList; // array
	private int counter; // counter

	OrderedIntList() {
		orderedIntList = new int[10];
	}

	public void insert(int element) {

		/**
		 * Iterating variables
		 */
		int j = 0;
		int i = 0;
		Boolean indexFound = false;
		int size = size() + 1;
		int length = length();

		
		/**
		 * Checks to see if the element already exists in the array
		 * Searches for the position that the element needs to be placed
		 * sets J to the place the element needs to be placed
		 */
		for (i = 0; i < counter && indexFound == false; i++) {
			if (element <= orderedIntList[i]) {
				if (element == orderedIntList[i]) {
					return;
				}
				indexFound = true;
			}
			j++;
		}
		
		
		if (size == length) {
			int[] copy_Ary = new int[length + (length/2)];
			for (i = 0; i < length-1; i++) {
				if (orderedIntList[i] != 0) {
					copy_Ary[i] = orderedIntList[i];
				}
			}
			orderedIntList = copy_Ary;
			
		}
		/**
		 * Checks to see if the counter and j index is greater than 1 if it is set them to 9
		 */
		if (counter == length()) {
			counter = length()-1;
		}
		if (j == length()) {
			j = length() - 1;
		}
		

		
		for (i = counter; i > j;) {
			orderedIntList[i] = orderedIntList[--i];
		}
		
		/**
		 * Adds 1 to the counter and sets the new element to the j index
		 */
		counter++;
		orderedIntList[j] = element;
		
	}


	//Method to print out the array function
	public void print() {
		int length = length();
		for (int i = 0; i < length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			if (orderedIntList[i] != 0) {
				System.out.print(orderedIntList[i] + "\t");
			}
		}
	}
	
	
	public int size() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length-1; i++) {
			if (orderedIntList[i] != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	
	public int length() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length-1; i++) {
			counter++;
		}
		return counter;
	}
	
	
	
	public void delete(int key) {
		for (int i = 0; i <= orderedIntList.length-1; i++) {
			if (i == key) {
				orderedIntList[i] = 0;
				for (int j = i; j < orderedIntList.length-1; j++ ) {
					orderedIntList[j] = orderedIntList[j+1];
				}
			}
		}
		
		//Checks to see if the size is less than half of the length of the array
		//If it is less than half then the array is copied to a new array and the
		//old one is deleted
		int size = size();
		int length = length();
		
		if (size == length/2 || size < length/2 ) {
			int[] newOrderedIntList = new int[length/2];
			for (int i = 0; i < length/2; i++) {
				newOrderedIntList[i] = orderedIntList[i];
			}
			orderedIntList = newOrderedIntList;
		}
	}
	
	
	
	
}

  