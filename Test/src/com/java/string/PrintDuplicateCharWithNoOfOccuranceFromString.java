package com.java.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author AROY
 *
 */
public class PrintDuplicateCharWithNoOfOccuranceFromString
{
    private static Scanner scan;

    public static void main ( String[] args )
    {
        scan = new Scanner( System.in );
        System.out.println( "Enter a String to print no of occurances for duplicate characters" );
        String str = scan.next();
        Map< Character, Integer > map = checkDuplicaCharOccurance( str );
        printDuplicaCharOccurance( map );
    }

    private static void printDuplicaCharOccurance ( Map< Character, Integer > map )
    {
        Iterator< Entry< Character, Integer > > itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
            Entry< Character, Integer > entry = itr.next();
            char key = entry.getKey();
            int val = entry.getValue();
            if ( val > 1 )
            {
                System.out.println( "Character: "+key + " no of occurances: " + val );
            }
        }

    }

    private static Map< Character, Integer > checkDuplicaCharOccurance ( String str )
    {
        Map< Character, Integer > map = new HashMap<>();
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            
            if ( map.containsKey( ch ) )
            {
                int value = map.get( ch );
                map.put( ch, value+1 );
            }
            else
            {
                map.put( ch, 1);
            }
        }

        return map;
    }

}
