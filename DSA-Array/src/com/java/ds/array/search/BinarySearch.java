package com.java.ds.array.search;

public class BinarySearch
{
    public static int searchElement = 30;

    public static void main ( String[] args )
    {

        int arr[] = { 2, 5, 7, 11, 12, 15, 20, 30, 34, 36 };
        // ---------->0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int size = arr.length;
        int start = 0, end = size - 1;

        // findElementWithLoop(start,end,arr);

        int index = findElementWithRecursive( start, end, arr );
        if ( index > -1 )
        {
            System.out.println( "Element at index " + index );
        }
        else
        {
            System.out.println( "Number does not exist in the array" );
        }
    }

    /**
     * Loop Method
     * 
     * @param start
     * @param end
     * @param arr
     */
    private static void findElementWithLoop ( int start, int end, int[] arr )
    {
        int mid = ( start + end ) / 2;
        while ( start <= end )
        {
            if ( arr[ mid ] == searchElement )
            {
                System.out.println( "Element found in the index of " + mid );
                break;
            }
            else if ( searchElement < arr[ mid ] )
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
            mid = ( start + end ) / 2;
        }
    }

    /**
     * Recursive Method
     * 
     * 
     * @param start
     * @param end
     * @param arr
     * @return
     */
    private static int findElementWithRecursive ( int start, int end, int[] arr )
    {
        int mid = ( start + end ) / 2;
        if ( arr[ mid ] == searchElement )
        {
            return mid;
        }
        else if ( searchElement > arr[ mid ] )
        {
            return findElementWithRecursive( mid + 1, end, arr );
        }
        else
        {
            return findElementWithRecursive( start, mid - 1, arr );
        }
    }
}
