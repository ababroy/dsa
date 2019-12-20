package com.java.string;

/**
 * 
 * @author AROY
 *
 */
public class StringReverse
{
    public static void main ( String[] args )
    {
        String strName = "Abhijit";
        System.out.println( "Reverse Input: " + strName );
        System.out.print( "Reverse Output: " );
        // printReverseSentence( strName );
        //String[] arr = printReverseWord( strName );
        //display( arr );
        reverseString(strName);
    }

    /*
     * Different Method
     * @param arr
     */

    private static void reverseString ( String str )
    {
        char[] chArr = str.toCharArray();
        int len = chArr.length;
        int i = 0;
        char[] nArr = new char[len];
        while ( len != i )
        {
            nArr[ i ] = chArr[ len-1 ];
            System.out.print( nArr[i] );
            len--;
        }
    }

    private static void display ( String[] arr )
    {
        int length = arr.length;
        for ( int i = length - 1; i >= 0; i-- )
        {
            if ( arr[ i ] != null )
            {
                System.out.print( " " + arr[ i ] );
            }
        }
    }

    private static String[] printReverseWord ( String strName )
    {
        String[] arr = new String[ strName.length() ];
        StringBuilder sb = new StringBuilder();
        int arrPointer = 0;
        for ( int i = 0; i < strName.length(); i++ )
        {
            char ch = strName.charAt( i );
            System.out.print( ch );
            sb.append( ch );
            if ( 32 == ( int ) ch )
            {
                System.out.println( ch + " Space Value: " + ( int ) ch );
                arr[ arrPointer ] = sb.toString();
                arrPointer++;
                sb = new StringBuilder();
                continue;
            }
        }
        return arr;
    }

    private static void printReverseSentence ( String strName )
    {
        for ( int i = strName.length() - 1; i >= 0; i-- )
        {
            char ch = strName.charAt( i );

            System.out.print( ch );
        }
    }
}
