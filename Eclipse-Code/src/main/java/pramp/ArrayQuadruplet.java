package pramp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

import CtCILibrary.AssortedMethods;
import myAlgorithms.myInsertionSort;

class ArrayQuadruplet {
	
	public static void main(String[] args) {
		int[] staticArray = {2, 7, 4, 0, 9, 5, 1, 3, 10, 20, 4, 2, 4, 1};
//		int[] array = AssortedMethods.randomArray(11, -10, 10);
		int[] arrayEven = AssortedMethods.randomArray(10000, 0, 100);
//		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		Stopwatch stopwatch = Stopwatch.createStarted();
		System.out.println("Before: ");
		AssortedMethods.printIntArray(staticArray);
		System.out.println("After: ");
		AssortedMethods.printIntArray(findQuadruplet(staticArray, 20));
		stopwatch.stop();
		long ms = stopwatch.elapsed(TimeUnit.MICROSECONDS);
		
		System.out.println("That took: " +ms+ "ms");
		
		///////////////////////
		stopwatch.reset();
		stopwatch.start();
		System.out.println("Before: ");
		//AssortedMethods.printIntArray(staticArray);
		System.out.println("After: ");
		AssortedMethods.printIntArray(findQuadrupletFast(staticArray, 20));
		
		stopwatch.stop();
		ms = stopwatch.elapsed(TimeUnit.MICROSECONDS);
		
		System.out.println("That took: " +ms+ "ms");
		
		
//		System.out.println("\nBefore: ");
//		AssortedMethods.printIntArray(array);
//		System.out.println("After: ");
//		AssortedMethods.printIntArray(findQuadruplet(array));
//		
		stopwatch.reset();
		stopwatch.start();
		System.out.println("\n\nBefore: ");
		//AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(findQuadruplet(arrayEven, 150));
		stopwatch.stop();
		ms = stopwatch.elapsed(TimeUnit.MICROSECONDS);
		
		System.out.println("That took: " +ms+ "ms");
		
		///////////////////////
		stopwatch.reset();
		stopwatch.start();
		System.out.println("Before: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		AssortedMethods.printIntArray(findQuadrupletFast(arrayEven, 150));
		
		stopwatch.stop();
		ms = stopwatch.elapsed(TimeUnit.MICROSECONDS);
		
		System.out.println("That took: " +ms+ "ms");
//
//		System.out.println("\nBefore: ");
//		AssortedMethods.printIntArray(arrayOdd);
//		System.out.println("After: ");
//		AssortedMethods.printIntArray(findQuadruplet(arrayOdd));
	}
	

//	input:  arr = [2, 7, 4, 0, 9, 5, 1, 3], s = 20
//								
//			onlyTwo: [9, 5] = 14
//	
//			output: [0, 4, 7, 9] # The ordered quadruplet of (7, 4, 0, 9)
//			                     # whose sum is 20.
	public static int[] findQuadrupletFast(int[] array, int n) {
		/*
		 * x + y + z + v = 20 
		 * 
		 * Sort Values
		 * if i = array[0] check if there is a value j where j <= 20 - i && j != i
		 * 		for j + i check if there is a value k where k <= 20 - j - i && k != i || j
		 * 			for k + j + i check if there is a value w where w <= 20 - j - i - k && ...
		 * 				return i, j, k, w if found
		 *
		 * O(n^3) time
		 */
		
		array = myInsertionSort.insertionSort(array);
		for (int i = array.length-1; i > 0; i--) {
			int x = array[i];
			if (x >= n) continue;
			
			for (int j = i-1; j > 0; j--) {
				int y = array[j];
				if (y > (n - x)) continue;
				
				int low = 0;
				int high = j-1;
				while (array[low] < array[high]) {
					if (array[low] + array[high] + x + y < n) {
						low++;
					}
					else if (array[low] + array[high] + x + y > n) {
						high--;
					}
					else if (array[low] + array[high] + x + y == n) {
						return new int[] {array[low], array[high], x, y};
					}
				}
			}
		}
		
		
		return null;
	}
	
	public static int[] findQuadruplet(int[] array, int n) {
		/*
		 * x + y + z + v = 20 
		 * 
		 * Sort Values
		 * if i = array[0] check if there is a value j where j <= 20 - i && j != i
		 * 		for j + i check if there is a value k where k <= 20 - j - i && k != i || j
		 * 			for k + j + i check if there is a value w where w <= 20 - j - i - k && ...
		 * 				return i, j, k, w if found
		 *
		 * O(n^4) time
		 */
		
		array = myInsertionSort.insertionSort(array);
		for (int i = array.length-1; i > 0; i--) {
			int x = array[i];
			if (x >= n) continue;
			
			for (int j = i-1; j > 0; j--) {
				int y = array[j];
				if (y > (n - x)) continue;
				
				for (int k = j-1; k > 0; k--) {
					int z = array[k];
					if (z > (n - x - y)) continue;
					
					for (int w = k-1; w > 0; w--) {
						if (array[w] + x+y+z == n){
							return new int[] {array[w], x, y, z};
						}
					}
				}
			}
		}
		
		
		return null;
	}
}
