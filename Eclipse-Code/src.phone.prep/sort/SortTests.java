package sort;

import java.util.ArrayList;
import java.util.Random;

public class SortTests {
	public static void main(String[] args) {
		//quickSortTest();
		bucketSortTest();
		
	}
	
	public static void bucketSortTest() {
		Random rand = new Random();
		Integer[] a = new Integer[10];
		for (int i = 0; i < 10; i++) {
			a[i] = rand.nextInt(20) + 1;
		}
		System.out.println("Before bucket sort: ");
		printArray(a);
		BucketSort.sort(a);
		System.out.println("After bucket sort: ");
		printArray(a);
	}
	
	public static void printArray(Integer[] a) {
		StringBuffer str = new StringBuffer();
		for(int i = 0; i< a.length; i++) {
			str.append(" " + a[i]);
		}
		System.out.println(str.toString());
	}
	
	public static void quickSortTest() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(9);
		a.add(2);
		a.add(3);
		a.add(7);
		a.add(6);
		a.add(8);
		a.add(10);
		a.add(11);
		a.add(1);
		
		QuickSort qs = new QuickSort(a);
		System.out.println(qs.array.toString());
		qs.sortQuick(0, a.size()-1);
		System.out.println(qs.array.toString());
	}
}
