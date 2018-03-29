package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class mySelectionSort {
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, -10, 10);
		int[] arrayEven = AssortedMethods.randomArray(22, -100, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		AssortedMethods.printIntArray(selectionSort(array));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(selectionSort(arrayEven));

		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(selectionSort(arrayOdd));
	}

	private static int[] selectionSort(int[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			
			for (int j = i; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			//Perform swap
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		return array;
	}
}
