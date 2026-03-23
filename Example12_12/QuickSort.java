/* Sorting an array using merge sort
  Anderson, Franceschi
*/

public class QuickSort 
{
  public static void main( String [ ] args ) 
  {
	 int [] numbers = { 66, 54, 75, 23, 15, 10, 98, 80 }; 
    quickSort( numbers, 0, numbers.length - 1 );
    for ( int i = 0; i < numbers.length; i++ )
	   System.out.print( numbers[i] + " " );
	 System.out.println( );     
  }   
   
  /**
  * quickSort method: sorts the subarray of arr 
  * (from index start to index end, both included)
  * in ascending order
  * @param arr, an array of ints
  * @param start an int, the starting index of the subarray
  * @param end an int, the ending index of the subarray
  */ 
  public static void quickSort( int [] arr, int start, int end )
  {
    System.out.println( "quickSort( " + start + ", " + end + " ) called" );
    if ( end > start ) // general case, >= 2 elements
	 {
	   int pivotIndex = partition( arr, start, end );
		// quick sort left subarray
	   quickSort( arr, start, pivotIndex - 1 );
		// quick sort right subarray
		quickSort( arr, pivotIndex + 1, end ); 
	 }
	 // else, 0 or 1 element ==> subarray is sorted, do nothing
  }

  /**
  * partition method: partitions the subarray of arr 
  * (from index start to index end, both included)
  * around the pivot, arr[start]
  * @param arr, an array of ints
  * @param start an int, the starting index of the subarray
  * @param end an int, the ending index of the subarray
  */    
  public static int partition( int [] arr, int start, int end )
  {
    System.out.println( "partition( " + start + ", " + end + " ) called" );
    int j = start;
	 int pivot = arr[start];
	 for ( int i = start + 1; i <= end; i++ )
	 {
	   if ( arr[i] < pivot )
		{
		  j++;
		  swap( arr, i, j );
		}
	 }
	 swap( arr, start, j );
	 return j;
  }

  /**
  * swap method: swaps the elements of arr 
  * at index i and index j  
  * @param arr, an array of ints
  * @param i an int, a valid index of arr
  * @param j an int, a valid index of arr
  */   
  public static void swap( int [] arr, int i, int j )
  {
	 int temp = arr[i];
	 arr[i] = arr[j];
	 arr[j] = temp;
  } 
}
