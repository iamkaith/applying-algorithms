/**
 * 
 */
package chapter3;

import java.util.Arrays;

/**
 * @author Kaith
 *
 */
public class BubbleSort {

	// "Bubble" up the highest element by swapping with right-most neighbour 
	// 
	
	public static char[] bubbleSort(char[] arr ) {
		
		for(int i = 0; i < arr.length-1; i++ ) {
			for(int j = 0; j < arr.length-1-i; j++ ) {
				if( arr[j+1] < arr[j] ) {
					char smallest = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = smallest;
				}
			}
			System.out.println(i + ": " + Arrays.toString(arr));
		}
		
		return arr;
	}
	
	// Another version using numbers
	// This time I included print in the innermost loop to illustrate how the bubbling works
	// Format: x.y
	// Where x is the outermost loop count
	// Where y is the inner most loop count - how many bubble swaps are happening
	
	public static int[] bubbleSort(int[] arr ) {
		
		for(int i = 0; i < arr.length-1; i++ ) {
			for(int j = 0; j < arr.length-1-i; j++ ) {
				if( arr[j+1] < arr[j] ) {
					int smallest = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = smallest;
					System.out.println(i + "." + j + ": " + Arrays.toString(arr));
				}
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
		
		System.out.println("Char Array to sort: " + Arrays.toString(test));		
		char[] result = bubbleSort(test);
		System.out.println("Result: " + Arrays.toString(result));
		
		System.out.println("---------------------------------------- ");
		
		int[] list = {85, 45, 68, 90, 29, 37, 18, 15};
		
		System.out.println("Int Array to sort: " + Arrays.toString(test));
		int[] numResult = bubbleSort(list);
		System.out.println("Result: " + Arrays.toString(numResult));
		
	}

}
