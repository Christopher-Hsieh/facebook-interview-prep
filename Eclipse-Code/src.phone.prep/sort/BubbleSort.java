package sort;

import java.util.Vector;

public class BubbleSort {
	
	static Vector<Integer> vector = new Vector<Integer>();
	
	public static void main(String[] args) {
		vector.addElement(1);
		vector.addElement(12);
		vector.addElement(4);
		vector.addElement(22);
		vector.addElement(3);
		vector.addElement(8);
		vector.addElement(15);
		vector.addElement(6);
		printVector();
		sort();
		printVector();
	}
	
	public static void sort() {
		boolean swapped = false;
		for (int i = 0; i < vector.size(); i++) {
			swapped = false;
			
			for (int j = 0; j < vector.size() - 1; j++) {
				if (vector.get(j) > vector.get(j+1)) {
					swap(vector.get(j), vector.get(j+1), j);
					swapped = true;
				}
			}
			if (swapped == false) {
				return;
			}
		}
	}
	
	public static void swap(int i1, int i2, int index) {
		int temp = vector.get(index);
		vector.set(index, i2);
		vector.set(index + 1, temp);
	}
	
	public static void printVector() {
		System.out.println("--- Printing Vector ---");
		for (Integer t : vector) {
			System.out.println(t);
		}
		System.out.println("--- End Vector ---");
	}
}
