package com.java.string;

public class CheckStringContainsOnlyDigit
{
    public static void main ( String[] args )
    {
        String input = "0000";
        try
        {
            int intput = Integer.parseInt( input );
            System.out.println( "String contains only digit, String: " + intput );
        }
        catch ( NumberFormatException nfe )
        {
            System.out.println( "String does not contain only digit" );
        }

    }
}
