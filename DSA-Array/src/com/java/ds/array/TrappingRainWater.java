package com.java.ds.array;

public class TrappingRainWater
{
    public static void main ( String[] args )
    {
        // int arr[] = { 3, 0, 0, 2, 0, 4 }; // 10
        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 3, 1, 2, 1 }; // 6
        // int arr[] = { 3, 1, 2 }; // 1
        // int[] arr = { 7, 4, 0, 9 }; // 10
        // int arr[] = { 8, 8, 2, 4, 5, 5, 1 }; // 4
        // int arr[] = {6,9,9}; // 0
        int arr[] = { 1, 1, 5, 2, 7, 6, 1, 4, 2, 3 }; // 7
        int trap = 0;
        if ( arr.length < 2 )
        {
            System.out.println( "Trapping rain water:" + trap );
        } // Check for less than 2 array length [unable to trap water]
        else
        {
            trap = getTrappedRainWater( trap, arr, 0 );
            System.out.println( "Trapping rain water:" + trap );
        }
    }

    private static int getTrappedRainWater ( int trap, int[] arr, int start )
    {
        int secondMax = start;
        for ( int s = start; s < arr.length; s++ )
        {
            if ( arr[ start ] > arr[ s ] )
            {
                if ( arr[ secondMax ] == arr[ s ] )
                    continue;
                if ( arr[ secondMax ] < arr[ s ] )
                {
                    secondMax = s;
                }
            }
            else if ( arr[ start ] <= arr[ s ] )
            {
                for ( int i = start; i < s; i++ )
                {
                    trap = trap + ( arr[ start ] - arr[ i ] );
                }
                start = s;
                secondMax = start + 1;
            } // increment start element if start can't trap rain water
        }

        trap = trap( trap, arr, start, secondMax );
        if ( secondMax < arr.length - 1 )
        {
            start = secondMax;
            trap = getTrappedRainWater( trap, arr, start ); // Recurse until 2ndMax reached to the end of array
        }
        return trap;
    }

    private static int trap ( int trap, int[] arr, int start, int end )
    {
        for ( int a = start + 1; a < end; a++ )
        {
            trap = trap + ( arr[ end ] - arr[ a ] );
        }
        return trap;
    }
}
