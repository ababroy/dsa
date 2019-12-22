package com.java.ds.util;

public final class Utility
{

    /**
     * To find the pivot element from an array
     * 
     * @param arr
     * @return
     */
    public static int getPivotIndexFromArray ( int start, int end, int[] arr )
    {

        // Step-1:
        int m = ( start + end ) / 2;

        // Step-2:
        if ( arr[ m ] > arr[ m + 1 ] )
        {
            return ( m + 1 );
        }
        else
        {
            if ( arr[ start ] > arr[ m ] )
            {
                getPivotIndexFromArray( start, m - 1, arr );
            }
            else
            {
                getPivotIndexFromArray( m + 1, end, arr );
            }
            return -1;
        }
    }

    /**
     * To print elements of an array
     * 
     * @param min_jump_arr
     */
    public static void printArray ( int[] min_jump_arr )
    {
        for ( int i : min_jump_arr )
        {
            System.out.print( i + " " );
        }
        System.out.println();
    }
}
