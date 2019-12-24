package com.java.ds.array;

public class MissingNumberInArray
{

    public static void main ( String[] args )
    {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        sumFormula( arr );
        xorFormula( arr );
    }

    private static void xorFormula ( int[] arr )
    {
        int getLastNumber = arr[ arr.length - 1 ];
        int missingNum = 0;
        System.out.println( getLastNumber );
        int xorArray = 0;
        for ( int i = 0; i < arr.length; i++ )
        {
            // System.out.println( xorArray +"^"+ arr[i]);
            xorArray = xorArray ^ arr[ i ];
        }
        int xorNum = 0;
        for ( int j = 1; j <= getLastNumber; j++ )
        {
            // System.out.println( xorNum + "^" + j );
            xorNum = xorNum ^ j;
        }

        missingNum = ( xorArray ^ xorNum );
        System.out.println( "missingNum: " + missingNum );
    }

    /**
     * Sum Formula
     * 
     * @param arr
     */
    private static void sumFormula ( int[] arr )
    {
        int getLastElement = arr[ arr.length - 1 ];
        int sumOfNumbers = ( getLastElement * ( getLastElement + 1 ) ) / 2;
        System.out.println( "sumOfNumbers: " + sumOfNumbers );
        int sumOfAllElementsInArray = 0;
        for ( int a : arr )
        {
            sumOfAllElementsInArray = sumOfAllElementsInArray + a;
        }

        System.out.println( "sumOfAllElementsInArray: " + sumOfAllElementsInArray );

        System.out.println( "Missing Number is: " + ( sumOfNumbers - sumOfAllElementsInArray ) );
    }

}
