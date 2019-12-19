package com.java.ds.array;
import com.java.ds.util.Utility;

public class Segregate0And1InArray
{
    public static void main ( String[] args )
    {
        int arr[] = { 0, 0, 1, 0, 1, 1, 0, 1 };
        int len = arr.length;
        int count = 0;
        for ( int i = 0; i < len; i++ )
        {
            if ( arr[ i ] == 0 )
            {
                count++;
            }
        }
        for ( int i = 0; i < arr.length; i++ )
        {
            if ( i < count )
            {
                arr[ i ] = 0;
            }
            else
            {
                arr[ i ] = 1;
            }
        }

        System.out.println( "Zero count: " + count );
        Utility.printArray( arr );
    }
}
