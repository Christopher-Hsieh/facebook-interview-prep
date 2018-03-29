package sort;

import java.util.ArrayList;

public class QuickSort {
	
	ArrayList<Integer> array;
	
	public QuickSort(ArrayList<Integer> array) {
		this.array = array;
	}
	
	public void sortQuick(int left, int right) {
		if (left >= right) return;
		int partition = array.get((left +right)/2);
		int i = left;
		int j = right;
		while (i <= j) {
			while(array.get(i) < partition) {
				i++;
			}
			while(array.get(j) > partition) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		System.out.println("i: "+i+" j: "+ j + " Left: "+left+" Right: "+right+" Array: "+array.toString() + " partition: " + partition);
		// if low position < right. Then sort from left-i
		if (i < right) {
			sortQuick(left, i);
		}
		if (j > left) {
			sortQuick(j, right);
		}
		
	}
	
	public void swap(int i, int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
}
