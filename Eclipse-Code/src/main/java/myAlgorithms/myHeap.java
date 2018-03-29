package myAlgorithms;

import CtCILibrary.AssortedMethods;
import CtCILibrary.BTreePrinter;

public class myHeap {
	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(11, -10, 10);
		int[] arrayEven = AssortedMethods.randomArray(22, -100, 100);
		int[] arrayOdd = AssortedMethods.randomArray(21, -100, 100);
		
		System.out.println("Before: ");
		AssortedMethods.printIntArray(array);
		System.out.println("After: ");
		int[] heap1 = createHeap(array);
		AssortedMethods.printIntArray(heap1);
		tailIndex--;
		debugger(heap1);
		AssortedMethods.printIntArray(heap1);
		
		
		tailIndex = 0;
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayEven);
		System.out.println("After: ");
		int[] heap2 = createHeap(arrayEven);
		AssortedMethods.printIntArray(heap2);
		tailIndex--;
		debugger(heap2);
		AssortedMethods.printIntArray(heap2);
		
		
		
		
		tailIndex = 0;
		System.out.println("\nBefore: ");
		AssortedMethods.printIntArray(arrayOdd);
		System.out.println("After: ");
		AssortedMethods.printIntArray(createHeap(arrayOdd));
		
		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
	}
	
	private static void debugger(int[] heap1) {
//		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
//		System.out.println("--- Remove Max: "+ extractMax(heap1) +" ---");
//		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
//		System.out.println("--- Remove Max: "+ extractMax(heap1) +" ---");
//		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
//		System.out.println("--- Remove Max: "+ extractMax(heap1) +" ---");
//		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
//		System.out.println("--- Remove Max: "+ extractMax(heap1) +" ---");
//		BTreePrinter.printNode(AssortedMethods.createTreeFromArray(heap1));
		for (int i = 0; i < heap1.length; i++) {
			extractMax(heap1);
		}
	}

	/*
	 * Insert - insert element at bottom, rightmost spot => bubble up swapping with parent
	 * Extract min - remove root by swapping with bottommost rightmost element => bubble down
	 * 
	 * HeapSort - Remove root, insert at end, heapify the remaining nodes
	 * 	children at indices 2i + 1 and 2i + 2
		parent at index floor((i − 1) ∕ 2).
	 */
	static int tailIndex = 0;
	
	public static int extractMax(int[] heap) {
		int max = heap[0];
		
		heap[0] = heap[tailIndex];
		heap[tailIndex] = max;
		tailIndex--;
		bubbleDown(heap, 0);
		return max;
	}
	
	private static void bubbleDown(int[] heap, int index) {
		if (index >= tailIndex) {return;}
		int leftChild = (2*index)+1;
		int rightChild = (2*index)+2;
		
		if (leftChild >= tailIndex) return;
		
		// If right child exists and is greater than the left child
		// Compare heap[index] with right child
		if (rightChild <= tailIndex && heap[leftChild] < heap[rightChild] && heap[index] < heap[rightChild]) {
			swap(heap, index, rightChild);
			bubbleDown(heap, rightChild);
		}
		// Else we can compare the left child	
		else if (heap[index] < heap[leftChild]) {
			swap(heap, index, leftChild);
			bubbleDown(heap, leftChild);
		}

	}

	public static int[] createHeap (int[] array) {
		int[] heap = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			heapInsert(heap, array[i]);
		}
		return heap;
	}
	
	public static void heapInsert(int[] heap, int value) {
		heap[tailIndex] = value;
		bubbleUp(heap, tailIndex);
		tailIndex++;
	}

	private static void bubbleUp(int[] heap, int index) {
		if (index == 0) {return;}
		int parentIndex = (int) Math.floor((index-1)/2);
		if (heap[index] > heap[parentIndex]) {
			swap(heap, index, parentIndex);
			bubbleUp(heap, parentIndex);
		}
	}

	private static void swap(int[] heap, int index, int parentIndex) {
		int temp = heap[index];
		heap[index] = heap[parentIndex];
		heap[parentIndex] = temp;
	}
	
}
