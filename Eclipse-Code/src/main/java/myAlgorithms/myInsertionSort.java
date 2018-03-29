package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class myInsertionSort {
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, -10, 10);
		int[] arrayEven = AssortedMethods.randomArray(22, -100, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		AssortedMethods.printIntArray(insertionSort(array));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(insertionSort(arrayEven));

		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(insertionSort(arrayOdd));
	}
/*
  	Step 1 − If it is the first element, it is already sorted. return 1;
	Step 2 − Pick next element
	Step 3 − Compare with all elements in the sorted sub-list
	Step 4 − Shift all the elements in the sorted sub-list that is greater than the 
	         value to be sorted
	Step 5 − Insert the value
	Step 6 − Repeat until list is sorted
 */

	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			
			for (int j = 0; j < i; j++) {
				// Found where to insert i
				if (array[i] <= array[j] ) {
					array = insert(array, i, j);
				}
			}
			
		}
		return array;
	}
	private static int[] insert(int[] array, int indexToInsertFrom, int indexToInsertAt) {
		int valueToInsert = array[indexToInsertFrom];
		for (int i = indexToInsertFrom; i > indexToInsertAt; i--){
			array[i] = array[i-1];
		}
		array[indexToInsertAt] = valueToInsert;
		return array;
	}
}
