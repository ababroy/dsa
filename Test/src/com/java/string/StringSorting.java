package com.java.string;

import java.util.Arrays;

/**
 * Incomplete
 * 
 * 
 * @author AROY
 *
 */
public class StringSorting
{
    public static void main ( String[] args )
    {
        String str = "abhijit";
        // sortStringMethod1( str );

        char[] charArray = str.toCharArray();
        Arrays.sort( charArray );
        for ( char c : charArray )
        {
            System.out.print( c );
        }

    }

    private static void sortStringMethod1 ( String str )
    {
        int arr[] = new int[ str.length() ];
        for ( int i = 0; i < str.length(); i++ )
        {
            char preChar = '\u0000';
            if ( i >= 1 )
            {
                preChar = str.charAt( i - 1 );
                System.out.println( "pre " + preChar + "=" + ( int ) preChar );
            }
            char ch = str.charAt( i );
            System.out.println( ch + "=" + ( int ) ch );
            if ( ( int ) preChar > ( int ) ch )
            {
                swap( preChar, ch );
            }
            arr[ i ] = ch;

        }
    }

    private static void swap ( char preChar, char ch )
    {
        char temp;
        temp = preChar;
        preChar = ch;
        ch = temp;
    }

}
