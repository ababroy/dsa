package com.java.string;

public class PrintAsciiValue
{
    public static void main ( String[] args )
    {
        String str = "abhijit";
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            System.out.println( ch + "=" + ( int ) ch );
        }
    }
}
