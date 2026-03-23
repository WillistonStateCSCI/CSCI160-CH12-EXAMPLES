/* Demonstrating recursion on an array
  Anderson, Franceschi
*/

public class RecursionOnArray 
{
  public static void main( String [] args ) 
  {
	 int [] numbers = { 12, 8, 10, 5 }; 
    int total = sum( numbers, 0 );
	 System.out.println( "total = " + total ); 
  }
 
 /**
  * sum method: returns the sum of all the elements 
  * in the subarray of arr that starts at index index
  * @param arr, an array of ints
  * @param index an int, the starting index of the subarray
  * @return an int, the sum of the elements of the subarray
  */ 
  public static int sum( int [] arr, int index )
  {
    // System.out.println( "sum called with index " + index );
    if ( index >= arr.length ) // subarray is empty
	   return 0;
    else // subarray is not empty
      return arr[index] + sum( arr, index + 1 );
  }	
}