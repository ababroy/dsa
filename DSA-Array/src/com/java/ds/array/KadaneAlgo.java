package com.java.ds.array;

/**
 * Max sub array
 * 
 * @author AROY
 *
 */
public class KadaneAlgo
{
    public static void main ( String[] args )
    {
        int arr[] = { 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };
        int start = 0;
        int end = 0;
        int s = 0;

        int max_end = 0;
        int max_so_far = arr[ 0 ];

        for ( int i = 0; i < arr.length; i++ )
        {
            max_end = max_end + arr[ i ];
            if ( max_so_far < max_end )
            {
                max_so_far = max_end;
                start = s;
                end = i;
            }

            if ( max_end < 0 )
            {
                max_end = 0;
                s = i + 1;
            }
        }
        System.out.println( "Max sub array start index: " + start );
        System.out.println( "Max sub array end index: " + end );

        for ( int i = start; i <= end; i++ )
        {
            System.out.print( arr[ i ] + " " );
        }

    }
}
