import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-02-04 Initial implementation
 */
public class SequentialSearch
    {

    /**
     * @param array
     *     input of list of integers
     * @param searchKey
     *
     * @return the array sorted from least to greatest
     */
    public static int sequentialSearch( final int[] array,
                                        final int searchKey )
        {

        // nested for loop to compare each integer with one another
        for ( int i = 0 ; i < ( array.length ) ; i++ )
            {
            if ( array[ i ] == searchKey )
                {
                return i ;

                } // end if

            } // end for

        return -1 ;

        }   // end selectionSort()


    /**
     * @param args
     *     an array of command-line arguments for the application
     */
    public static void main( String[] args )
        {
        try ( Scanner input = new Scanner( System.in ) )
            {
            System.out.println( "This program is a demonstration of sequential search on an array of integers." ) ;

            System.out.printf( "Please input size of array: " ) ;
            int arraySize = input.nextInt() ;

            int[] theArray = new int[ arraySize ] ;
            System.out.printf( "%nPlease input your array in the format of integers seperated by spaces: " ) ;

            // creates an array based on values provided in the console
            for ( int i = 0 ; i < arraySize ; i++ )
                {
                theArray[ i ] = input.nextInt() ;

                } // end for

            System.out.printf( "%nPlease input the item you wish to search for: " ) ;
            int searchKey = input.nextInt() ;

            int result = sequentialSearch( theArray, searchKey ) ;

            // prints out the index at which the element appears
            if ( result == -1 )
                {
                System.out.printf( "%nItem does not appear in array." ) ;

                } // end if
            else
                {
                System.out.printf( "%nItem appears at index %d.", result ) ;

                } // end else

            } // end try

        } // end main()

    }
// end class SelectionSort
