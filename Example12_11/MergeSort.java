/* Sorting an array using merge sort
  Anderson, Franceschi
*/

public class MergeSort 
{
  public static void main( String [] args ) 
  {
	 int [] numbers = { 66, 54, 75, 23, 15, 10, 98, 80 }; 
    mergeSort( numbers, 0, numbers.length - 1 );
    for ( int i = 0; i < numbers.length; i++ )
	   System.out.print( numbers[i] + " " );
	 System.out.println( ); 
  }
 
 /**
  * mergeSort method: sorts the subarray of arr 
  * (from index start to index end, both included)
  * in ascending order
  * @param arr, an array of ints
  * @param start an int, the starting index of the subarray
  * @param end an int, the ending index of the subarray
  */ 
  public static void mergeSort( int [] arr, int start, int end )
  {
    // System.out.println( "mergeSort( " + start + ", " + end + " ) called" );
    if ( start < end ) // general case
	 {
	   int middle = ( start + end ) / 2;
		// sort the left part of the array
		mergeSort( arr, start, middle );
		// sort the right part of the array
	   mergeSort( arr, middle + 1, end );	
		// merge the 2 parts
		merge( arr, start, middle, middle + 1, end );
	 }
	 // else, base case, empty or 1 element array, already sorted
  }
	
 /**
  * merge method: merges, in ascending order, 
  * the two subarrays of arr defined as follows:
  * left subarray: between indexes start1 and end1, both included
  * right subarray: between indexes start2 and end2, both included
  * @param arr, an array of ints
  * @param start1 an int, the starting index of the left subarray
  * @param end1 an int, the ending index of the left subarray 
  * @param start2 an int, the starting index of the right subarray
  * @param end2 an int, the ending index of the right subarray 
  */ 
  public static void merge( int [] arr, int start1, int end1, 
                                        int start2, int end2 )
  {
    // System.out.println( "merge( " + start1 + ", " + end1
    //                       + ", " + start2 + ", " + end2 + " ) called" );
    // merge the 2 sides into a temp array
	 int [] temp = new int[arr.length]; // temporary array
	 int i = start1;
	 int j = start2;
	 int k = start1;
    
    // generate merged subarray until one side is done
	 while ( i <= end1 && j <= end2 )
	 {  
		if ( arr[i] < arr[j] )
		{
		  temp[k] = arr[i];
		  i++;
		}
		else
		{
		  temp[k] = arr[j];
		  j++;
		}
		k++;
    }
		
	 // flush left subarray if necessary
	 while ( i <= end1 )
	 {  
		temp[k] = arr[i];
		i++;
		k++;
	 }
		
	 // flush right subarray if necessary
	 while ( j <= end2 )
	 {  
	   temp[k] = arr[j];
		j++;
		k++;
	 }
		
	 // write back temp into arr
	 for ( i = start1; i <= end2; i++ )
    {
	   arr[i] = temp[i];
    }
  }
}