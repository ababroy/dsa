package com.java.string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author AROY
 *
 */
public class RemoveDuplicateCharFromString
{
    private static Scanner scan;

    public static void main ( String[] args )
    {
        scan = new Scanner(System.in);
        System.out.println( "Enter a String to remove duplicate character" );
        String str = scan.next();
        usingLinkedHashSet(str);
        
    }
    
    public static void usingLinkedHashSet(String str)
    {
        Set<Character> set = new LinkedHashSet<>();
        for(int i =0; i < str.length(); i++)
        {
            set.add(str.charAt( i ));
        }
        System.out.print( "Output: " );
        Iterator<Character> itr = set.iterator();
        while(itr.hasNext())
        {
            Character c = itr.next();
            System.out.print( c );
        }
    }
}


