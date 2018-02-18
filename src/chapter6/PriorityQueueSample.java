/**
 * 
 */
package chapter6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Kae
 * 
 * Messing with a priority queue to understand how a binary heap works.
 *
 */
public class PriorityQueueSample {

	public static void main(String[] args) {
		int[] a = {1, 10, 5, 3, 4, 7, 6, 9, 8};

		
        PriorityQueue<Integer> min = new PriorityQueue<>(a.length);
        PriorityQueue<Integer> max = new PriorityQueue<>(a.length, new MaxComparator());

        for (int x : a) {
            min.offer(x);
            max.offer(x);
        }

        System.out.println("Min PQ: " + min);

        int[] results = new int[4];
        
        System.out.println("Obtain the 4 smallest numbers");
        for(int i = 0; i < results.length; i++ ) {
        	results[i] = min.poll();
        }
        
        System.out.println("Results: " + Arrays.toString(results));
        System.out.println("Leftover in Min PQ: " + min);
        
        System.out.println("--------------------------------------");
        
        System.out.println("Obtaining the 4 largest numbers");
        for(int i = 0; i < results.length; i++ ) {
        	results[i] = max.poll();
        }
        
        System.out.println("Results: " + Arrays.toString(results));
        System.out.println("Leftover in Max PQ: " + max);

	}
	
	static class MaxComparator implements Comparator<Integer> {

		// will sort largest
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }

}

