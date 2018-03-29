package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class myBinarySearch {

	public static void main(String[] args) {
		int[] randomArrayEven = AssortedMethods.randomArray(22, -100, 100);
		randomArrayEven = BubbleSort.bubbleSort(randomArrayEven);
		int[] randomArrayOdd = AssortedMethods.randomArray(21, -100, 100);
		randomArrayOdd = BubbleSort.bubbleSort(randomArrayOdd);
		int indexEven = AssortedMethods.randomIntInRange(0,20);
		int indexOdd = AssortedMethods.randomIntInRange(0,20);
		printResult(binarySearch(randomArrayEven, randomArrayEven[indexEven], 0, randomArrayEven.length-1), randomArrayEven, randomArrayEven[indexEven]);
		printResult(binarySearch(randomArrayOdd, randomArrayOdd[indexOdd], 0, randomArrayEven.length-1), randomArrayOdd, randomArrayOdd[indexOdd]);
	}
	
	/*
	 * Returns index of value in array
	 */
	public static int binarySearch(int[] array, int value, int low, int high) {
		int mid = (low + high) / 2;
		System.out.println("low: "+low+" high: "+high);
		if (value == array[mid]) return mid;
		if (value == array[mid+1]) return mid+1;

		if (value > array[mid]) {
			return binarySearch(array, value, mid, high);
		}
		else if (value < array[mid]) {
			return binarySearch(array, value, low, mid);
		}
		
		return mid;
	}
	
	public static void printResult(int index, int[] array, int desiredValue) {
		System.out.println("Index: " + index + " value: " + array[index] + " found: " + desiredValue);
		System.out.println("From Array: ");
		AssortedMethods.printIntArray(array);
		System.out.println("");
	}
}
