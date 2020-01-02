package com.java.ds.array;

import java.util.Stack;

import com.java.ds.util.Utility;

public class TwoStacksInOneArray
{
    public static void main ( String[] args )
    {
        Stack< Character > stack1 = new Stack<>();
        stack1.push( 'a' );
        stack1.push( 'b' );
        stack1.push( 'c' );
        stack1.push( 'd' );
        stack1.push( 'e' );
        stack1.push( 'f' );
        stack1.push( 'g' );
        stack1.push( 'h' );
        stack1.push( 'i' );

        Stack< Character > stack2 = new Stack<>();
        stack2.push( 's' );
        stack2.push( 't' );
        stack2.push( 'u' );
        stack2.push( 'v' );
        stack2.push( 'w' );
        stack2.push( 'x' );
        stack2.push( 'y' );
        stack2.push( 'z' );

        Character[] arr = new Character[ 15 ];

        int i = 0;
        int j = arr.length - 1;
        while ( i <= j )
        {
            int s1Size = stack1.size();
            int s2Size = stack2.size();

            if ( stack1.size() != 0 )
            {
                arr[ i ] = stack1.pop();
                ;
                i++;
            }

            if ( stack2.size() != 0 )
            {
                arr[ j ] = stack2.pop();
                j--;
            }

            if ( s1Size == 0 && s2Size == 0 )
            {
                break;
            }
        }

        Utility.printArray( arr );
    }
}
