package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class myShellSort {

	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, -10, 10);
		int[] arrayEven = AssortedMethods.randomArray(22, -100, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		AssortedMethods.printIntArray(shellSort(array));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(shellSort(arrayEven));

		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(shellSort(arrayOdd));
	}

	 /* 	Step 1 − Initialize the value of h
		 	Step 2 − Divide the list into smaller sub-list of equal interval h
		 	Step 3 − Sort these sub-lists using insertion sort
		 	Step 3 − Repeat until complete list is sorted
	  */
	
	
	private static int[] shellSort(int[] array) {
		int interval = 0;
		while( interval < array.length / 3) { 
			      interval = interval * 3 + 1;
		}
		for (; interval > 0; interval-- ) {
			for (int i = 0; i < interval; i++) {
				array = sortIntervalValues(array, interval, i);
			}
		}
		return array;
	}
	
	private static int[] sortIntervalValues(int[] array, int intervalSize, int startLoc) {
		int interval = startLoc;
		
		while (interval < array.length) {
			int minIndex = getMinIndexFromInterval(array, interval, intervalSize);
			array = swapAndShiftWithInterval(array, minIndex, interval, intervalSize);
			interval += intervalSize;
		}
		return array;
	}

	private static int[] swapAndShiftWithInterval(int[] array, int minIndex, int indexToInsert, int intervalSize) {
		int minValue = array[minIndex];
		int minInsertLoc = indexToInsert;

		while (minIndex > indexToInsert) {
			array[minIndex] = array[minIndex-intervalSize];
			minIndex = minIndex-intervalSize;
		}
		
		array[minInsertLoc] = minValue;
		return array;
	}

	private static int getMinIndexFromInterval(int[] array, int interval, int intervalSize) {
		int minIndex = interval;
		
		while (interval < array.length) {
			if (array[minIndex] > array[interval]) minIndex = interval;
			interval += intervalSize;
		}
		
		return minIndex;
	}
}
