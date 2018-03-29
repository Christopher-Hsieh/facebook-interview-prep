package myAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

import CtCILibrary.AssortedMethods;

public class myBucketSort {
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, 0, 10000);
		int[] arrayEven = AssortedMethods.randomArray(22, 0, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, 0, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		AssortedMethods.printIntArray(sort(array));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(sort(arrayEven));

		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(sort(arrayOdd));
	}

	private static int[] sort(int[] array) {
		ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
        // Determine minimum and maximum values
        Integer minValue = array[0];
        Integer maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
		int bucketSize = 4;
		int bucketCount = (maxValue - minValue) / bucketSize + 1;
		
		for (int i = 0; i < bucketCount; i++) {
			buckets.add(new ArrayList<Integer>());
		}
		

		
		for (int i = 0; i < array.length; i++) {
			buckets.get((array[i]-minValue)/bucketSize).add(array[i]);
		}
		for (int i = 0; i < bucketCount; i++) {
			Collections.sort(buckets.get(i));
		}
		
		int[] sortedArray = new int[array.length];
		int i = 0;
		int bucketNum = 0;
		for (ArrayList<Integer> bucket : buckets) {
			System.out.println("Bucket[" + bucketNum + "] =>" + bucket.toString());
			for (Integer value : bucket) {
				sortedArray[i++] = value;
			}
		}
		
		return sortedArray;
	}

}
/*	Like using hash functions. 
	To choose which bucket to put value in: ((value-minvalue) / bucketSize). 
	Sort the buckets individually, then place back into original array.
*/