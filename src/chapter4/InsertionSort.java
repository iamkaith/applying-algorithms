/**
 * 
 */
package chapter4;

import java.util.Arrays;

/**
 * @author Kaith
 *	Applying insertion sort algorithms to sort a list of character in alphabetical order.
 */
public class InsertionSort {

	
	/*
	 * Best insertion sort algorithm based on textbook recommendation.
	 * 
	 *  Rearranges either none or just once per iteration.
	 *	The left-most side is the "sorted" category and will only be "read through" once and rearranged accordingly.
	 *	Assumes first element is "sorted" in the beginning and starts off looking at the second element.
	 *	The lookup is then done on the left hand side and rearranges as necessary. 
	 *	Then it is assumed that the first and second element are sorted and the third element is now the element being compared.
	 *
	 *	Visualization like this:
	 *	Where A is the sorted section
	 *	| represents a divider and the element being compared is the next immediate neighbour to the right of the divider
	 *
	 *	A | B B B B B B 
	 *	A A | B B B B B 
	 *  A A A | B B B B
	 * 
	 */
	public static char[] insertionSort(char[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
				
		int j;
		char value;
		int loopCounter = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			value = arr[i]; 
			j = i-1; 
			
			while( j >= 0 && arr[j] > value ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = value;
			
			System.out.println(loopCounter + ": " + Arrays.toString(arr)); // for visualization purposes
			loopCounter++;
		}
		
		return arr;
		
	}
	
	
	/*
	 * Second version of insertion sort based on question 10 where the rearrangement occurs by swapping with left neighbour until sorted.
	 * Less efficient than above because the swap could occur more than once per character. Many steps going left.
	 * Whereas with the method above the "swap" there only happens once per iteration.
	 *  
	 * Unlike the previous example I included the visualization within the method so it is easier to understand.
	 * 
	 */
	public static char[] insertionSort2(char[] arr ) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		
		int j;
		
		
		for(int i = 1; i < arr.length; i++) {
			j = i-1;
			int whileCounter = 0;
			while(j >= 0 && arr[j] > arr[j+1] ) {
				
				char first = arr[j];	// temporary placeholders 
				char second = arr[j+1];
				
				arr[j] = second; // actual swap
				arr[j+1] = first;
				
				System.out.println(i + "." + whileCounter + ": " + Arrays.toString(arr));
				
				j--;
				whileCounter++;
			}
		}
		
		return arr;
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testWord = "EXAMPLE";
		char[] testArray = testWord.toCharArray();
		
		System.out.println("Starting....");
		System.out.println("Using insertion sort algorithm to sort an array of characters into alphabetical order. ");
		System.out.println("Test word is: " + Arrays.toString(testArray));
		System.out.println("Result is: " + Arrays.toString( insertionSort(testArray)));
		System.out.println("End.");
		
		String testWord2 = "EXAMPLE";
		char[] testArray2 = testWord2.toCharArray();
		
		System.out.println("----------------");
		System.out.println("Starting....");
		System.out.println("Another version of insertion sort algorithm but rearranges by swapping adject characters (right to left) until sorted. ");
		System.out.println("Visualization format using counters : x.y");
		System.out.println("Where x is position of the character being moved && y represents swap step going left.");
		System.out.println("Test word is: " + Arrays.toString(testArray2));
		System.out.println("Result is: " + Arrays.toString( insertionSort2(testArray2)));
		System.out.println("End.");

	}

}
