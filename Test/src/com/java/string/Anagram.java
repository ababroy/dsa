package com.java.string;

import java.util.Arrays;

public class Anagram
{
    public static void main ( String[] args )
    {
        String str = "a decimal point";

        String test = "i m a dot in place";

        str = fullTrimmer( str );
        test = fullTrimmer( test );
        boolean bool = checkAnagram( str, test );
        if ( bool )
        {
            System.out.println( "It's an anagram" );
        }
        else
        {
            System.out.println( "It's NOT an anagram" );
        }
    }

    private static String fullTrimmer ( String str )
    {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            if ( ( int ) ch == 32 )
            {
                continue;
            }
            sb.append( ch );
        }
        return sb.toString().trim();
    }

    private static boolean checkAnagram ( String str, String test )
    {
        if ( str.trim().equalsIgnoreCase( test ) )
        {
            return true;
        }
        if ( str.length() == test.length() )
        {
            char[] strArray = str.toCharArray();
            Arrays.sort( strArray );
            char[] testArray = test.toCharArray();
            Arrays.sort( testArray );
            for ( int i = 0; i < strArray.length; i++ )
            {
                if ( strArray[ i ] != testArray[ i ] )
                {
                    return false;
                }
                System.out.println( strArray[ i ] + "==" + testArray[ i ] );
            }
        }
        else
        {
            return false;
        }

        return true;
    }
}
