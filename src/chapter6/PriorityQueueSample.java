/**
 * 
 */
package chapter6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author Kae
 * 
 * Messing with a priority queue to understand how a binary heap works.
 *
 */
public class PriorityQueueSample {

	public static int[] randomNumberGenerator(int howMany) {
		int[] results = new int[howMany];
		
		Random rand = new Random();
		for(int i = 0; i < howMany; i++ ) {
			results[i] = rand.nextInt(100);
		}
		
		return results;
	}
	
	// Polling PQ
	public static int[] polling (int number, PriorityQueue<Integer> pq) {
		int[] results = new int[number];
		
		for(int i = 0; i < results.length; i++) {
			results[i] = pq.poll();
		}
		
		return results;
	}
		
	
	public static void main(String[] args) {
		
		// Init
		int[] a = {1, 10, 5, 3, 4, 7, 6, 9, 8};
		int[] forFun = randomNumberGenerator(30);
		
        PriorityQueue<Integer> min = new PriorityQueue<>(a.length);
        PriorityQueue<Integer> max = new PriorityQueue<>(forFun.length, new MaxComparator());

        for (int x : a) {
            min.offer(x);
            max.offer(x);
        }
        
        for (int x : forFun) {
            max.offer(x);
        }

        // Processing
        System.out.println("Min PQ: " + min);        
        System.out.println("Obtain the 4 smallest numbers");
        int[] results = polling(4, min);
        
        System.out.println("Results: " + Arrays.toString(results));
        System.out.println("Leftover in Min PQ: " + min);
        
        System.out.println("--------------------------------------");
        
        System.out.println("Obtaining the 9 largest numbers");
        int[] results2 = polling(9, max);
        
        System.out.println("Results: " + Arrays.toString(results2));
        System.out.println("Leftover in Max PQ: " + max);

	}
	
	static class MaxComparator implements Comparator<Integer> {

		// will sort largest
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }

}

