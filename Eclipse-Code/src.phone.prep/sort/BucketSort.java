package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {
    private static final int DEFAULT_BUCKET_SIZE = 1;

    public static void sort(Integer[] array) {
        sort(array, DEFAULT_BUCKET_SIZE);
    }

    public static void sort(Integer[] array, int bucketSize) {
        if (array.length == 0) {
            return;
        }

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

        // Initialise buckets
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < array.length; i++) {
        	System.out.println("Bucket: " + ((array[i] - minValue) / bucketSize) + " Added Value Is: " + array[i]);
            buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
        }
        
        // Print Each Bucket
        for (int i = 0; i < buckets.size(); i++) {
        	System.out.print("\nBucket[" + i +"]:");
        	for (int j = 0; j < buckets.get(i).size(); j++) {
        		System.out.print(" "+ buckets.get(i).get(j));
        	}
        	System.out.println("");
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            //InsertionSort.sort(bucketArray);
            Arrays.sort(bucketArray);
            for (int j = 0; j < bucketArray.length; j++) {
                array[currentIndex++] = bucketArray[j];
            }
        }
    }
}