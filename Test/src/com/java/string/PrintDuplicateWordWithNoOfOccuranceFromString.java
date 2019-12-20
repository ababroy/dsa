package com.java.string;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 
 * @author AROY
 *
 */
public class PrintDuplicateWordWithNoOfOccuranceFromString
{
    private static Scanner scan;

    public static void main ( String[] args )
    {
        scan = new Scanner( System.in );
        System.out.println( "Enter a String to print no of occurances for duplicate characters" );
        String str = "I boy am a boy"; // scan.next();
        // Map< Character, Integer > map = checkDuplicateCharOccurance( str );
        Map< String, Integer > map = checkDuplicateCharOccurance( str );
        printDuplicateWordOccurance( map );
    }

    private static void printDuplicateWordOccurance ( Map< String, Integer > map )
    {
        Iterator< Entry< String, Integer > > itr = map.entrySet().iterator();
        while ( itr.hasNext() )
        {
            Entry< String, Integer > entry = itr.next();
            String key = entry.getKey();
            int val = entry.getValue();
            if ( val > 1 )
            {
                System.out.println( "Character: " + key + " => Occurances: " + val );
            }
        }

    }

    private static Map< String, Integer > checkDuplicateCharOccurance ( String str )
    {
        StringBuilder sb = new StringBuilder();
        Map< String, Integer > map = new LinkedHashMap<>();
        for ( int i = 0; i < str.length(); i++ )
        {

            Character ch = str.charAt( i );
            
            sb.append( ch );
            if ( ch.charValue() == 32 || i == str.length()-1 )
            {
                boolean b = map.containsKey( sb.toString().trim());
                
                if ( b )
                {
                    Integer in = map.get( sb.toString() );
                    map.put( sb.toString().trim(), ( in + 1 ) );
                }
                else
                {
                    map.put( sb.toString().trim(), 1 );
                }
                sb = new StringBuilder();
                continue;
            }
           
        }
        return map;
    }

}
