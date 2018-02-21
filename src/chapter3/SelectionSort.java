/**
 * 
 */
package chapter3;

import java.util.Arrays;

/**
 * @author Kaith
 *
 */
public class SelectionSort {

	// Find the smallest element and swap with a corresponding index
	// Sort left to right, swap goes in the same direction
	// First element gets swapped, then second, etc.
	
	// visually looks like 
	// | 89 45 68 90 29 34 "17" swap 17 and 89
	// 17 | 45 68 90 "29" 34 89 swap 29 and 45
	// 17 29 | 68 90 45 "34" 89 swap 34 and 68 
	// 17 29 34 | 90 "45" 68 89 swap 45 and 90
	// 17 29 34 45 | 90 "68" 89 swap 68 and 90
	// 17 29 34 45 68 | 90 "89" swap 89 and 89
	// 17 29 34 45 68 89 90 |   done
	
	
	public static char[] selectionSort(char[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			
			int index = i;
			
			for(int j = i+1; j < arr.length; j++ ) {
				
				if(arr[j] < arr[index] ) { // if an element is smaller on the right-hand side
					index = j;
				}
				
				char smallest = arr[index]; // grab the smallest element
				arr[index] = arr[i]; 	   // swap the larger element and put it in the smallest element's position 
				arr[i] = smallest; 		   // move the smallest element to the left where the bigger element used to be
			}
			
			System.out.println(i + ": " + Arrays.toString(arr));
		}
		
		return arr;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String example = "EXAMPLE";
		char[] test = example.toCharArray();
		
		System.out.println("Array to sort: " + Arrays.toString(test));
		
		char[] result = selectionSort(test);
		
		System.out.println("Result: " + Arrays.toString(result));

	}

}
