package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(3);
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(6);
		a.add(9);
		a.add(10);
		a.add(8);
		int[] array = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			array[i] = a.get(i);
		}
		//printArray(array);
		printArray(mergeSort(array));
	}

	private static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		}
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
		int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
		int[] merged = merge(left, right);
		return merged;
	}
	
	private static int[] merge(int[] leftArray, int[] rightArray) {
		int mergedSize = leftArray.length + rightArray.length;
		int[] mergedArray = new int[mergedSize];
		
		int currLeft = 0;
		int currRight = 0;
		
		for (int i = 0; i < mergedSize; i++) {
			if (currLeft >= leftArray.length) {
				mergedArray[i] = rightArray[currRight++];
				continue;
			}
			
			if (currRight >= rightArray.length) {
				mergedArray[i] = leftArray[currLeft++];
				continue;
			}
			
			if (leftArray[currLeft] < rightArray[currRight]) {
				mergedArray[i] = leftArray[currLeft++];
			} else {
				mergedArray[i] = rightArray[currRight++];
			}
		}
		return mergedArray;
	}

	private static void printArray(int[] array) {
		System.out.println("Printing Array ---");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
