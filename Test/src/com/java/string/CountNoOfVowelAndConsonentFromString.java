package com.java.string;

import java.util.Arrays;
import java.util.List;

public class CountNoOfVowelAndConsonentFromString
{
    public static void main ( String[] args )
    {
        String str = "CountNoOfVowelAndConsonentFromString";
        List< Character > vowel = Arrays.asList( new Character[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' } );
        int vCount = 0;
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            if ( vowel.contains( ch ) )
            {
                System.out.println( ch + " is vowel" );
                vCount++;
            }
            else
            {
                System.out.println( ch + " is Consonent" );
            }
        }
        System.out.println( "No of Vowels: " + vCount );
        System.out.println( "No of Consonent: " + ( ( str.length() - 1 ) - vCount ) );
    }
}
