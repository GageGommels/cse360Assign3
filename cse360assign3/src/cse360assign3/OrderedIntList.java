package cse360assign3;

public class OrderedIntList {

	/**
	 * These are class variables that are used in the program
	 * 
	 * orderedIntList is an array data type and is what the user will be using most of the time
	 * counter is to keep track of how many elements are in the array
	 * aryString is what holds the format of the array in String form
	 */
	private int[] orderedIntList; // array
	private int counter; // counter
	private String aryString;

	/**
	 * We have 2 constructors in this class:
	 * One generates an array that has a default size of ten
	 * The second is one that can be generated with a specific size
	 */
	OrderedIntList() {
		orderedIntList = new int[10];
		
	}
	OrderedIntList(int size) {
		orderedIntList = new int[size];
		
	}

	
	/**
	 * This is the method that will take an integer input and insert it into the array in ascending order
	 * and will also increase the size of the array by 50% if the array is 100% full. It will also check to see if the 
	 * element parsed into it is a duplicate and if it is it will simply end the method.
	 * @param element: this is an integer value that will be added to the array
	 */
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
		
		/**
		 * Does the check to see if the size of the array is 100% full
		 * If the array is 100% full then it will increase the size of the array by 50%
		 */
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
	
	/**
	 * This Method will iterate through the array and count how many elements are currently occupying the array
	 * It will then store the number in a variable counter and then return it.
	 * @return Integer: which is an variable that will return how many elements are present inside of the array.
	 */
	public int size() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length-1; i++) {
			if (orderedIntList[i] != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * This method will iterate through the array and find the actual length of the array.
	 * It then stores it in counter and returns it as an Integer.
	 * @return Integer: Returns the Length of the array.
	 */
	public int length() {
		int counter = 0;
		for(int i = 0; i <= orderedIntList.length-1; i++) {
			counter++;
		}
		return counter;
	}
	
	
	/**
	 * This function will delete a index that is provided by the user as key.
	 * After the index is deleted everything behind that index moves up by 1.
	 * If the array is less than or equal to 50% full then  the array will shrink down to 50% if its length.
	 * @param integer key: Is a parsed integer that will be the index that will be removed from the array.
	 */
	public void delete(int key) {
		for (int i = 0; i <= orderedIntList.length-1; i++) {
			if (i == key) {
				orderedIntList[i] = 0;
				for (int j = i; j < orderedIntList.length-1; j++ ) {
					orderedIntList[j] = orderedIntList[j+1];
				}
			}
		}
		
		/**
		 * Checks to see if the size is less than half of the length of the array
		 * If it is less than half then the array is copied to a new array and the
		 * old one is deleted.
		 */
		
		//declaring variables
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
	
	
	/**
	 * To string is a method that will return the array in columns of 5 and length/5 rows.
	 * There is a tab after each element except for the last one in each row.
	 * @return String aryString: Returns a string that has formated the array into columns of 5
	 * 							 and length/5 rows. 
	 */
	public String toString() {
		aryString = "";
		// variable that will allow us to keep track of how many elements have been added to the String
		int aryString_counter = 0;
		for (int i = 0; i < length(); i++) {
			if(orderedIntList[i] != 0) {
				aryString = aryString + orderedIntList[i];
				aryString_counter++;
			}
			if(aryString_counter % 5 != 0 && i != size()-1 && orderedIntList[i] != 0) {
				aryString = aryString + " ";
			} else if (aryString_counter % 5 == 0 && aryString_counter != 0 && orderedIntList[i] != 0 && i != size()-1) {
				aryString = aryString + "\n";
			}
		}
		return aryString;
	}
	
	
	
	
}

  