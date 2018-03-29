package myAlgorithms;

import java.util.Arrays;

import CtCILibrary.AssortedMethods;

public class myRadixSort {
	
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, 0, 10);
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
	
	private static int printNumberAtPlace(int num, int place) {
		int exp = 1;
		for (int i =0; i < place; i++) {
			exp *= 10;
		}
		return (num/exp)%10;
	}

	private static int[] sort(int[] array) {
        // Find the maximum number to know number of digits
        int m = getMax(array, array.length);
 
        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(array, array.length, exp);
            //AssortedMethods.printIntArray(array);
    	}
		return array;
	}
	
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
