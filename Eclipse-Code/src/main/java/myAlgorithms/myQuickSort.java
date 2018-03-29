package myAlgorithms;

import CtCILibrary.AssortedMethods;

public class myQuickSort {
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, 0, 50);
		int[] arrayEven = AssortedMethods.randomArray(22, -100, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		AssortedMethods.printIntArray(quickSort(array));
		
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(quickSort(arrayEven));

		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(quickSort(arrayOdd));
	}
	
	private static int[] quickSort(int[] array) {
		return quickSortHelper(array, 0, array.length-1);
	}
	
	private static int[] quickSortHelper(int[] array, int lo, int hi) {
		if (lo >= hi) return array;
		System.out.println("Partition on number: " + array[hi]+ " low: " + lo + " high: " + hi);
		int part = partition(array, lo, hi);
		System.out.println("Result location: " + part);
		quickSortHelper(array, lo, part-1);
		quickSortHelper(array, part+1, hi);
		
		return array;
	}
	
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
}
