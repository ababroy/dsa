package com.java.ds.array;

public class TrappingRainWater
{
    public static int trap = 0;

    public static void main ( String[] args )
    {
        int trap = getTrappedRainWater();
        System.out.println( "Trapping rain water:" + trap );
    }

    private static int getTrappedRainWater ()
    {
//         int arr[] = { 3, 0, 0, 2, 0, 4 };
//        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 3, 1, 2, 1 };
//         int arr[] = { 3, 1, 2 };
//         int[] arr = {7, 4, 0, 9};

         int arr[] = { 8, 8, 2, 4, 5, 5, 1 };
        int start = 0;

        // for start with zero value
        while ( arr[ start ] <= 0 )
        {
            start = start + 1;
        }

        trap( arr, start );

        return trap;
    }

    private static void trap ( int[] arr, int start )
    {
        for ( int a = start; a < arr.length; a++ )
        {

            int startVal = arr[ start ];
            int nxtVal = arr[ a ];
            System.out.println( "val " + nxtVal + " start: " + startVal + " == val > start : " + ( nxtVal > startVal ) );
            boolean flag = false;

            if ( nxtVal >= startVal )
            {
                for ( int i = start; i < a; i++ )
                {
                    // trap = trap + ( arr[ start ] - arr[ i ] );
                    trap = trap + ( arr[ start ] - arr[ i ] );
                    flag = true;
                }
                start = a;
            }
            if ( flag == false && a == arr.length - 1 )
            {
                int get2ndMax = 0;
                for ( int i = a; i > start; i-- )
                {
                    if ( arr[ i ] > get2ndMax )
                    {
                        get2ndMax = arr[ i ];
                    }
                }
                trap = trap + ( arr[ start ] - get2ndMax );
                flag = true;
                //trap( arr, start + 1 );
            }

        }
    }
}
