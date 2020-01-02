package com.java.ds.util;

/**
 * Array Utility Class
 * 
 * 1. printArray
 * 
 * 2. swap
 * 
 * 3. getPivotIndex
 * 
 * 4. GCD
 * 
 * @author royabhix
 *
 */
public final class Utility
{

    /**
     * To find the pivot element from an array
     * 
     * @param arr
     * @return
     */
    public static int getPivotIndex ( int start, int end, int[] arr )
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
                return getPivotIndex( start, m - 1, arr );
            }
            else
            {
                return getPivotIndex( m + 1, end, arr );
            }
        }
    }

    /**
     * To print elements of an array
     * 
     * @param arr
     */
    public static < T > void printArray ( T[] arr )
    {
        for ( T i : arr )
        {
            System.out.print( i + " " );
        }
        System.out.println();
    }

    /**
     * Swap two numbers
     * 
     * @param number1
     * @param number2
     */
    public static Integer[] swap ( int number1, int number2, Integer[] arr )
    {

        // i= 10 , j= 20
        arr[ number1 ] = arr[ number1 ] + arr[ number2 ]; // i = 10 + 20 = 30
        arr[ number2 ] = arr[ number1 ] - arr[ number2 ]; // j = 30 - 20 = 10
        arr[ number1 ] = arr[ number1 ] - arr[ number2 ]; // i = 30 - 10 = 20

        return arr;
    }

    /**
     * GCD
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static int gcd ( int num1, int num2 )
    {
        if ( num2 == 0 )
        {
            return num1;
        }
        else
        {
            return gcd( num2, num1 % num2 );
        }
    }

}
