package com.java.string;

public class WordCountInString
{
    public static void main ( String[] args )
    {
        String str = "I am a Software Enggineer";
        int count = 0;
        for ( int i = 0; i < str.length(); i++ )
        {

            Character ch = str.charAt( i );
            System.out.print( ch );
            if ( ch.charValue() == 32 || i == str.length() - 1 )
            {
                count++;
                continue;
            }
        }
        System.out.println();
        System.out.println( "Count : " + count );
    }
}
