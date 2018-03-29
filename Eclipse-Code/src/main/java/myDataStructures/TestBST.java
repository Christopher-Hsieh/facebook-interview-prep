package myDataStructures;

import CtCILibrary.AssortedMethods;
import CtCILibrary.BTreePrinter;
import CtCILibrary.TreeNode;
import myAlgorithms.TreeTraversals;

public class TestBST {
	public static void main(String[] args) {
		
		//TreeNode randomBST = AssortedMethods.randomBST(10, 0, 50);
		//BTreePrinter.printNode(randomBST);
		
		int[] array = AssortedMethods.randomArray(10, 0, 10);
		TreeNode arrayBST = AssortedMethods.createTreeFromArray(array);
		
		BTreePrinter.printNode(arrayBST);
		//TreeTraversals.printAllTraversals(arrayBST);
		AssortedMethods.printIntArray(array);
		
		
		BST myBST = new BST();
		for (int i = 0; i < array.length; i++) {
			myBST.insert(array[i]);
		}
		BTreePrinter.printNode(myBST.root);
//		myBST.find(0);
//		myBST.find(5);
//		myBST.find(10);
		int[] counts = new int[12];
		for(int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		for (int i = 0; i < 1000; i++) {
			int value = myBST.getRandom();
			if (value == -1) {
				counts[11]++;
			}else {
				counts[value]++;
			}
			
		}
		AssortedMethods.printIntArray(counts);
	}
}
