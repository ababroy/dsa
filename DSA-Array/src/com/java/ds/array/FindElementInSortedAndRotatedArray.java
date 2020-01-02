package com.java.ds.array;

/**
 * INCOMPLETE
 * 
 * @author royabhix
 *
 */
public class FindElementInSortedAndRotatedArray
{
    public static int se = 3;

    public static void main ( String[] args )
    {
        int[] arr = { 4, 5, 6, 7, 8, 1, 2, 3 };// { 9, 12, 15, 17, 25, 28, 32, 37, 3, 5, 7, 8 };

        int pivotIndex = findPivot( arr );
        System.out.println( "Pivot Index: " + pivotIndex + " Value: " + arr[ pivotIndex ] );

        int start = 0;
        int end = arr.length-1;
        if ( se == arr[ pivotIndex ] )
        {
            System.out.println( "Element found at the index of " + pivotIndex );
        }
        else if ( se > arr[ pivotIndex] && se < arr[end])
        {
            start = pivotIndex + 1;

        }
        else
        {
            end = pivotIndex - 1;
        }
        findElement( start, end, arr );

    }

    private static void findElement ( int start, int end, int[] arr )
    {

        while ( start <= end )
        {
            int mid = ( start + end ) / 2;
            if ( se == arr[ mid ] )
            {
                System.out.println( "Element at the index of : " + mid );
            }
            if ( se > arr[ mid ] )
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

    }

    private static int findPivot ( int[] arr )
    {
        int size = arr.length;
        int start = 0;
        int end = size - 1;

        int pivotIndex = findIndex( start, end, arr );

        return pivotIndex;
    }

    private static int findIndex ( int start, int end, int[] arr )
    {
        int pivot = 0;
        // Step-1
        int mid = ( start + end ) / 2;
        // step-2
        if ( arr[ mid ] > arr[ mid + 1 ] )
        {
            pivot = mid + 1;
            return pivot;
        }
        else
        {
            if ( arr[ start ] > arr[ mid ] )
            {
                return findIndex( start, mid - 1, arr );
            }
            else
            {
                return findIndex( mid + 1, end, arr );
            }
        }
    }

}
