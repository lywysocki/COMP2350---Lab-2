import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-02-04 Initial implementation
 */
public class BubbleSort
    {

    /** buble 
     * @param array
     *     input of list of integers
     *
     * @return the array sorted from least to greatest
     */
    public static int[] bubbleSort( final int[] array )
        {

        // nested for loop to compare each integer with one another
        for ( int i = 0 ; i < ( array.length - 1 ) ; i++ )
            {

            for ( int j = 0 ; j < ( array.length - 1 - i ) ; j++ )
                {
                if ( array[ j ] > array[ j + 1 ] )
                    {
                    int temp = array[ j ] ;
                    array[ j ] = array[ j + 1 ] ;
                    array[ j + 1 ] = temp ;

                    }

                } // end for

            }

        return array ;

        }   // end selectionSort()


    /**
     * @param args
     *     an array of command-line arguments for the application
     */
    public static void main( String[] args )
        {
        try ( Scanner input = new Scanner( System.in ) )
            {
            System.out.println( "This program is a demonstration of Bubble Sort on a list of integers.");

            System.out.printf( "Please input size of array: " ) ;
            int arraySize = input.nextInt() ;

            int[] theArray = new int[ arraySize ] ;
            System.out.printf( "%nPlease input your array in the format of integers seperated by spaces: " ) ;

            // creates an array based on values provided in the console
            for ( int i = 0 ; i < arraySize ; i++ )
                {
                theArray[ i ] = input.nextInt() ;

                } // end for

            bubbleSort( theArray ) ;

            // formats and prints new array of sorted integers
            String s = "" ;
            System.out.printf( "%nYour sorted array: " ) ;
            for ( int a : theArray )
                {
                System.out.printf( s + a ) ;
                s = ", " ;

                } // end for

            } // end try

        } // end main()

    }
// end class BubbleSort
