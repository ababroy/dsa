package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharFromString
{
    public static void main ( String[] args )
    {
        String str = "abhijitt";

        Set< Character > dup = new HashSet<>();
        char[] chArr = str.toCharArray();

        for ( int i = 0; i < chArr.length; i++ )
        {
            boolean bool = dup.add( chArr[ i ] );
            if ( !bool )
            {
                System.out.println( "Duplicate Character: " + chArr[ i ] );
            }
        }
    }
}
