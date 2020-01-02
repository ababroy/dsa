package com.java.ds.array;

import java.util.Arrays;

public class PairsWithGivenSumInArray
{

    public static int givenSum = 11;

    public static void main ( String[] args )
    {
        int[] arr = { 1, 3, 2, 5, 4, 6, 8, 11, 9 }; // { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Sort it first if not
        Arrays.sort( arr );
        // -----------0, 1, 2, 3, 4, 5, 6, 7,  8, 9
        int left = 0;
        int right = arr.length - 1;

        while ( left < right )
        {
            if ( arr[ left ] + arr[ right ] > givenSum )
            {
                right--;
            }
            else if ( arr[ left ] + arr[ right ] < givenSum )
            {
                left++;
            }
            else
            {
                System.out.println( "Left Pair:" + left + " || Right Pair: " + right );
                 left++;
            }
        }
    }

}
