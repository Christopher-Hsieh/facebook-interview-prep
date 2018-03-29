package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class myMergeSort {
	public static void main(String[] args) {
		int[] arrayEven = AssortedMethods.randomArray(11, 1, 22);  // size is really 22 (0-21)
		int[] arrayOdd = AssortedMethods.randomArray(10, 1, 22);	//size is really 21 (0-20)
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(mergeSort(arrayEven));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(mergeSort(arrayOdd));
	}

	public static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
		return array;
	}
		int[] left = 	mergeSort(copyArr(array, 0, array.length/2));
		int[] right =  	mergeSort(copyArr(array, array.length/2, array.length));
		
//		if (array.length <= 1) {
//			return array;
//		}
//		int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
//		int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
		return merge(left, right);
	}

	private static int[] copyArr(int[] array, int low, int high) {
		int[] copy = new int[(high-low)];
		int index = 0;
		for (int i = low; i < high; i++) {
			//AssortedMethods.printIntArray(copy);
			copy[index++] = array[i];
		}
		return copy;
	}
	
	private static int[] merge(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int arr1Loc = 0;
		int arr2Loc = 0;
		
		for (int i = 0; i < merged.length; i++ ) {
			if (arr1Loc == arr1.length) {
				merged[i] = arr2[arr2Loc++];
			}
			else if (arr2Loc == arr2.length) {
				merged[i] = arr1[arr1Loc++];
			}
			else if (arr1[arr1Loc] < arr2[arr2Loc]) {
				merged[i] = arr1[arr1Loc++];
			}
			else {
				merged[i] = arr2[arr2Loc++];
			}
		}
		
		return merged;
	}
}
