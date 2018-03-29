[CTCI Resources](http://www.crackingthecodinginterview.com/resources.html)

[CTCI java library for node, trie, tree printer, etc.](https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/CtCILibrary/CtCILibrary)

[CTCI Solutions](https://github.com/careercup/CtCI-6th-Edition/tree/master/Java)



| DataStructure | Implementation and Notes |
| ------------- | ------------------------ |
| [LinkedList](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#linkedlist) | Single and Double |
| [Binary Tree](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#binary-tree) | Memorize Inorder, preorder, postorder. Implement DELETE in tree. Implement tree modified i.e. tracks sums. |
| [Hash(Maps, Sets, Tables)](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#hashmaps-sets-tables) | [Hashsets, maps, tables](https://stackoverflow.com/questions/5407421/design-a-hashtable), know how to implement my own hash table in the space of an interview. |
| [Stack](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#stack) | Review or rewrite basic stack |
| [Queue](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#queue) | Review or rewrite basic queue |
| [Graphs](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#graphs)  | Which representation is best?  |
| [Trie](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#trie) | Insert, search, maybe delete.  Big Os |
| [Hash array mapped Trie]() | [Wiki](https://en.wikipedia.org/wiki/Hash_array_mapped_trie) |
| [Heap](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#heap) | [tutorialsPoint](https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm) - Heap as array. Insert new element at tail, bubbleup. Extract by swapping root w. bottommost rightmost element, bubbledown root.  |
| [Vector+ArrayList](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#vector--arraylist) | Review basic API and how to use generics |
| [Iterator](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#iterator) |Test self to get and use iterator i.e. for(String classObj : class) |
| [Special Trees (Self-Balancing) - RedBlack](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#special-trees) | How to implement, traverse. Why are they good, FB mentioned red-black trees |
| [Spanning Tree](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#spanning-trees) |

| Algorithm | Implementation and Notes |
| --------- | ------------------------ |
| [Binary Search](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#binary-search) | Recursive(array, searchedForValue, low, high) |
| [Bubble Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#bubble-sort) | Two for loops, comparing elements right next to each other. Usage - small data sets |
| [Merge Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#merge-sort) | Remember only a few lines of code, and the recursion only takes an array as the single parameter. writing merge(left,right) is longest part |
| [Quick Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#quick-sort) | choose pivot (usually rightmost), between lo and hi find all lower than pivot, insert pivot when lo = hi. Probably good for partially sorted data. choosing a random partition makes worst case less likely for a bad array. |
| [Bucket Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#bucket-sort) | (check if more than just these two) __bucket sort good for uniformially distributed data or we could have tons of empty buckets__ Create buckets, hash values to each bucket, sort buckets individually, iterate buckets one by one to sorted array. |
| [Radix Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#radix-sort) | Use counting sort on every digit, starting with least significant. |
| [Counting Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#counting-sort) | __best for keys in a small specific range__ make array size of data range, add number of values appearances up in counting array. Use counting array to create sorted array.  |
| [BFS](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#bfs) | Use a queue, mark nodes |
| [DFS](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#dfs) | DFS(node) for node.children DFS(Child) => make nodes for cycles |
| [*Selection Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#selection-sort) | Done | Select the smallest element, place it at the front. Repeat... |
| [*Insertion Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#insertion-sort) | Iterate through list. Insert next element into subarray starting at front of original array |
| [*Heap Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#heap-sort)| heapsort by extract root (swap w/ bottommost rightmost) bubbledown root using only remaining elements. |
| [*Tree Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#tree-sort)| Turn data into BST, the in-order traversal for sorted data. |
| [*Cube Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#cube-sort) | Complex 3d array sort. [info](https://sites.google.com/site/binarysearchcube/bsc) & [code for cubesort](https://docs.google.com/file/d/0B8KIVX-AaaGiUnJKcUN3SlRrU1E/edit) |
| [*Shell Sort](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#shell-sort) | Use insetion Sort on sub arrays. Sub arrays are determined by an interval: h = h*3+1. Shrink interval. __Useful for sorting small arrays in place, worst case is better than some other algos. Also simplier to implement__ |
| [Djikstra, Bi-directional search]() | Investigate Djikstra, Bi-directional search and more - FB seems key about graphs, i.e. their main API |
| [*Topological Sort]() | 4.7 in CTCI, order all nodes so edge (a, b), a appears before b. linearly sorted.  |

| Concept | Implementation and Notes |
| ------- | ------------------------ |
| [Recursion](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#recursion) | Need practice for linked list, binary search, and others. Bottom up or top down. Bottom-up think mergesort - solve small subsets, then combine result. top-down - ? |
| [Probability](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#probability)  |
| [Bit Manipulation](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#bit-manipulation) | Need programming practice, general ops are good |
| [Java & O-O Design](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#java--o-o-design)  | O-O concepts abstraction, inheritance, cohesion, coupling etc. & other mastery/Basic APIs - especially math |
| [Threads, locks, mutex, semaphore](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#threads-locks-mutex-semaphore) |
| [Dynamic Programming](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#dynamic-programming) | Memomiztion and bottom up. Memomization - solve each problem, cache results i.e. making a fib call to each number once. Bottom-up solve the small problems, use the results to add to your new set of sub-problems i.e. step counting problem, only set amount of ways to reach a new step, add prev totals also. __start with recursion then cache the result. Bottom up => build from previous, Top down => save results, check if you already solved__ |
| [NP-Complete](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#np-complete)  |
| [Memory (Stack vs. Heap)](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#memory-stack-vs-heap) |
| [Minimum Cuts](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#minimum-cuts) |
| [Powers of 2](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#powers-of-2) |

| Trick | Explanation |
| ------- | ------------------------ |
| [Find digit in number](https://github.com/JumpingRock/facebook-interview-prep/blob/master/Coding-Interview/Learning.md#find-digit) | With 802 digit at place 2 is 8, place 1 is 0, place 0 is 2 |


### Extra
- BitSet & BitVector classes - 8.4 bits
- 8.9, possible common FB question 2D array
- Review LinkedList Recursion
- Super usage, ctci 3.2
- External sort, ctci 10.6
- BFS 4.1, look at code
- 5.3 look at code
- 1.6, string builder ops


# Data Structures

### LinkedList
```
Whatever you do, do not sort it

Implementation
    implement Node(), appendToTail(), deleteNode(Object data)

Run Times - Single and Double
  	O(n)Θ(n) Access, search	
   	O(1)Θ(1) Insert, delete
Space
	O(n)
```

### Binary Tree
```java
Implementation 

    /* Inorder   - left subtree, root, right subtree
     * Preorder  - left subtree, right subtree, root. Bottom up.
     * Postorder - root, left subtree, right subtree. Start with root, recurse through left, recurse through right. top down.
     */
     
    public static void inOrder(TreeNode node) {
		/*
		 * Searched smallest to largest
		 */
		
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	public static void preOrder(TreeNode node) {
		/*
		 * Check the root first
		 */
		if (node != null) {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public static void postOrder(TreeNode node) {
		/*
		 * Root is always last visited
		 */
		if (node != null) {
			postOrder(node.right);
			postOrder(node.left);
			System.out.println(node.data);
		}
	}
	
Run Times
    Insert Worst/Avg. O(log(n)), find any worst O(log(n)), create worst O(nlog(n))
Space
	O(n)
```

### Hash(Maps, Sets, Tables)

```
Implementation 
    key % hashTableSize
    Use an array of lists to store the values. 
    If there is a collision append the value to that keys location in the array.

Run Times
    Θ(1) lookup, insert, delete
    This is amortized based off if the hash function has no collisions - worst is O(n) for above
    
Space
    O(n) Best and worst
    

HashMap - Not Synchronized, not thread safe, but faster. Allows nulls.
HashTable - Synchronized, slower, thread safe. Does not allow nulls.
HashSet - Does not allow duplicate values, use when we need a unique list.
```

### Stack
```
Implementation (Not Done)
    pop() push() peek(), use Obeject data for node data

Run Times
    O(1)Θ(1) push, pop, head
    O(n) search
    
Space
    O(n)Θ(n) search, access
```

### Queue
```
Implementation (Not Done)
    enqueue(), dequeue(), size(), peek()

Run Times
    O(1)Θ(1) enqueue(), dequeue(), peek()
    O(n)Θ(n) search, access
    
Space
    O(n)
```

### Graphs
```
Implementation (Need construction of a graph)
    Implement by..

Run Times
    O
```

### Trie
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

### Heap
```java
Implementation 
    	/*
	 * Insert - insert element at bottom, rightmost spot => bubble up swapping with parent
	 * Extract min/max - remove root by swapping with bottommost rightmost element => bubble down
	 */
	 
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

Run Times
    	Θ(log n) O(log n) Extract and insert <=make sure
Space
	O(n)
```

### Vector + ArrayList
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

### Iterator
```java
Implementation 
    public class myClassIterator<String> implements Iterator<Object> {
        private ArrayList<?> myClass;
        private position;
        
        public myClassIterator(myClass myClassBase) {
            this.myClass = myClassBase.getMyClass();
        }
        
        @Override
        public boolean hasNext() {...} // position < myClass.size()
        
        @Override
        public Object next() {...} // myClass.get(position++)
        
        @Overrive
        public void remove() {...} // myClass.remove(position)
    }
    
    public class myClass implements Iterable<String> {
        @Override
        public Iterator<String> iterator() { 
            return new myClassIterator(this);
        }
        
        private ArrayList<String> myClass = new ArrayList<String>();

        public myClass(ArrayList myClass){
            this.myClass = myClass;
        }

        public ArrayList getMyClass() {
            return myClass;
        }
    }

Run Times
    O
```

### Special Trees
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

### Spanning Trees
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

# Algorithms

### Binary Search
```java
Implementation
    public static int binarySearch(int[] array, int value, int low, int high) {
		int mid = (low + high) / 2;

		if (value == array[mid]) return mid;
		if (value == array[mid+1]) return mid+1; // Only needed if size is odd

		if (value > array[mid]) {
			return binarySearch(array, value, mid, high);
		}
		else if (value < array[mid]) {
			return binarySearch(array, value, low, mid);
		}
		return mid;
	}

Run Times
    O(log n) Θ(log n) - due to recursion takes stack size of O(log n)
Space
	O(1) for search, O(n) for the tree
	

```

### Bubble Sort
```
Implementation
    Two for loops. In the inner loop swap if a[i] > a[i+1]

Run Times
   	Θ(n^2)	O(n^2)
Space
	O(1)
```

### Merge Sort
```java
Implementation 
   	private static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		}
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
		int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
		int[] merged = merge(left, right);
		return merged;
	}

Run Times
    	O(n log(n)) Θ(n log(n))
Space
	O(n)
```

### Quick Sort
```java
Implementation 
    Pick partition (middle of low-high). 
    Put all elements lower than partition to the left, all elements higher to the right. 
    perform quick sort on low-partition-1, partition+1-high.
    
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
       
    int partition(int arr[], int low, int high)
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
    
Run Times
    	Θ(n log(n))	O(n^2) - Randomized pivot makes O(n log n) much more likely
Space
	O(log(n))
```

### Bucket Sort
```java
Implementation 
    // Like using hash functions. 
    // To choose which bucket to put value in: ((value-minvalue) / bucketSize). 
    // Sort the buckets individually, then place back into original array.

Run Times
    	Θ(n+k)	O(n^2) - where k is number of buckets
Space 
	O(n) - number of buckets
```

### Radix Sort
```java
Implementation 
	private static int[] sort(int[] array) {
		// Find the maximum number to know number of digits
		int m = getMax(array, array.length);

		// Do counting sort for every digit. Note that instead
		// of passing digit number, exp is passed. exp is 10^i
		// where i is current digit number
		for (int exp = 1; m/exp > 0; exp *= 10) {
		    countSort(array, array.length, exp);
		}
			return array;
	}

Run Times
    	Θ(nk)	O(nk) => k is range a digit can be. in normal decimal it is 0-9 (or 10). 
Space 
	O(n+k) 
```

### Counting Sort
```java
Implementation 
	/*
		For simplicity, consider the data in the range 0 to 9. 
		Input data: 1, 4, 1, 2, 7, 5, 2
		  1) Take a count array to store the count of each unique object.
		  Index:     0  1  2  3  4  5  6  7  8  9
		  Count:     0  2  2  0   1  1  0  1  0  0

		  2) Modify the count array such that each element at each index 
		  stores the sum of previous counts. 
		  Index:     0  1  2  3  4  5  6  7  8  9
		  Count:     0  2  4  4  5  6  6  7  7  7

		The modified count array indicates the position of each object in 
		the output sequence.

		  3) Output each object from the input sequence followed by 
		  decreasing its count by 1.
		  Process the input data: 1, 4, 1, 2, 7, 5, 2. Position of 1 is 2.
		  Put data 1 at index 2 in output. Decrease count by 1 to place 
		  next data 1 at an index 1 smaller than this index.
  	*/
	
    void sort(char arr[])
    {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        char output[] = new char[n];
 
        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i=0; i<n; ++i)
            ++count[arr[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i=1; i<=255; ++i)
            count[i] += count[i-1];
 
        // Build the output character array
        for (int i = 0; i<n; ++i)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
 
        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i<n; ++i)
            arr[i] = output[i];
    }
    
Run Times
    	Θ(n+k)	O(n+k)	- n is number of elements, k is range elements can be from 1-k. i.e. only values 0 to 9 appear in an array, k=9
Space 
	O(k) 
```

### BFS
```
Implementation (Not Done)
    Using a Queue -> Need to mark visited nodes if we are worried about a cycle.
    I.e. BFS of a binarytree does not need to mark nodes

Run Times
    O
```

### DFS
```
Implementation (Not Done)
    Recursion, track the depths

Run Times
    O
```

### *Selection Sort
```
Implementation 
   	Step 1 − Set MIN to location 0
	Step 2 − Search the minimum element in the list
	Step 3 − Swap with value at location MIN
	Step 4 − Increment MIN to point to next element
	Step 5 − Repeat until list is sorted

Run Times
    	Θ(n^2)	O(n^2)	
Space
	O(1)
```

### *Insertion Sort
```java
Implementation 
/*
  	Step 1 − If it is the first element, it is already sorted. return 1;
	Step 2 − Pick next element
	Step 3 − Compare with all elements in the sorted sub-list
	Step 4 − Shift all the elements in the sorted sub-list that is greater than the 
	         value to be sorted
	Step 5 − Insert the value
	Step 6 − Repeat until list is sorted
 */

	private static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			
			for (int j = 0; j < i; j++) {
				// Found where to insert i
				if (array[i] <= array[j] ) {
					array = insert(array, i, j);
				}
			}
			
		}
		return array;
	}
	
	private static int[] insert(int[] array, int indexToInsertFrom, int indexToInsertAt) {
		int valueToInsert = array[indexToInsertFrom];
		for (int i = indexToInsertFrom; i > indexToInsertAt; i--){
			array[i] = array[i-1];
		}
		array[indexToInsertAt] = valueToInsert;
		return array;
	}
	
Run Times
    	Θ(n^2)	O(n^2)	
```

### *Heap Sort
```java
Implementation 
	 /* HeapSort - Remove root, insert at end, heapify the remaining nodes
	  * 	children at indices 2i + 1 and 2i + 2
	  *	parent at index floor((i − 1) ∕ 2)
	  */
	  
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
	
Run Times
    Θ(n log(n))	O(n log(n))
Space
	O(1) takes O(n) to maintain structure
```

### *Tree Sort
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

### *Cube Sort
```
Implementation (Not Done)
    implement by...

Run Times
    O
```

### *Shell Sort
```java
Implementation
    	 /* 	 Step 1 − Initialize the value of h
		 Step 2 − Divide the list into smaller sub-list of equal interval h
		 Step 3 − Sort these sub-lists using insertion sort
		 Step 3 − Repeat until complete list is sorted
	  */
	  
	private static int[] shellSort(int[] array) {
		int interval = 0;
		while( interval < array.length / 3) { 
			      interval = interval * 3 + 1;
		}
		for (; interval > 0; interval-- ) {
			for (int i = 0; i < interval; i++) {
				array = sortIntervalValues(array, interval, i);
			}
		}
		return array;
	}
	
	private static int[] sortIntervalValues(int[] array, int intervalSize, int startLoc) {
		int interval = startLoc;
		
		while (interval < array.length) {
			int minIndex = getMinIndexFromInterval(array, interval, intervalSize);
			array = swapAndShiftWithInterval(array, minIndex, interval, intervalSize);
			interval += intervalSize;
		}
		return array;
	}
	
	private static int[] swapAndShiftWithInterval(int[] array, int minIndex, int indexToInsert, int intervalSize) {...}
	private static int getMinIndexFromInterval(int[] array, int interval, int intervalSize) {...}
	
Run Times
    	Ω(n log(n))	
   	Θ(n(log(n))^2)	
    	O(n(log(n))^2)
Space
	O(1)
```

# Concepts

### Recursion
```
divide and conquer can be bottom up or top down.
```

### Probability
```
TODO
```

### Bit Manipulation
```
TODO
```

### Java & O-O Design
```
TODO
```

### Threads, locks, mutex, semaphore
```
TODO
```

### Dynamic Programming
```
TODO
```

### NP-Complete
```
TODO
```

### Memory (Stack vs. Heap)
```
TODO
```

### Minimum Cuts
```
TODO
```

### Powers of 2
```sh
Power           Exact Value         Approx Value        Bytes
---------------------------------------------------------------
7                             128
8                             256
10                           1024   1 thousand           1 KB
16                         65,536                       64 KB
20                      1,048,576   1 million            1 MB
30                  1,073,741,824   1 billion            1 GB
32                  4,294,967,296                        4 GB
40              1,099,511,627,776   1 trillion           1 TB
```

# Tricks
### Find digit
```java
	private static void printNumberAtPlace(int num, int place) {
		int exp = 1;
		for (int i =0; i < place; i++) {
			exp *= 10;
		}
		System.out.println(num + " at place: " + place + " is: " +(num/exp)%10);
	}
```
