package com.java.ds.array;

import com.java.ds.util.Utility;

public class FindElementFromSortedAndRotatedArray
{

    public static void main ( String[] args )
    {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        // int[] arr = { 9, 12, 15, 17, 25, 28, 32, 37, 3, 5, 7, 8 };
        // ---------- 0 |1 |2 |3 |4 |5 |6 |7
        int pivotIndex = Utility.getPivotIndexFromArray( 0, arr.length-1, arr );
        if ( pivotIndex > -1 )
        {
            System.out.println( "Pivot Index: " + pivotIndex + " => Value:" + arr[ pivotIndex ] );
        }
        else
        {
            System.out.println( "Not Found any pivot element" );
        }

    }

}
