package com.java.ds.array;

import com.java.ds.util.Utility;

public class ZigZagArray
{
    public static void main ( String[] args )
    {
        int[] arr = { 8,4,5,3,5,1,10,9 };// { 3, 4, 6, 2, 1, 8, 9 };

        Utility.printArray( arr );

        boolean flag = false;
        for ( int i = 0; i < arr.length - 1; i++ )
        {
            if ( flag == true )
            {
                if ( arr[ i ] < arr[ i + 1 ] )
                {
                    Utility.swap( i, i + 1, arr );
                }

            }
            else
            {
                if ( arr[ i ] > arr[ i + 1 ] )
                {
                    Utility.swap( i, i + 1, arr );
                }
            }
            flag = !flag;
        }

        Utility.printArray( arr );

    }

}
