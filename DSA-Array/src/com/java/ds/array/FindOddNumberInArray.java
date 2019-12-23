package com.java.ds.array;

public class FindOddNumberInArray
{

    public static void main ( String[] args )
    {
        int[] arr = { 1, 5, 5, 1, 2, 3, 4, 2, 1, 2, 1, 2, 3, 2,4 };

        int size = arr.length;

        int x=arr[0];
        for ( int i = 1; i < size; i++ )
        {
            int b = arr[i];
            x = x ^ b;
        }
        
        if(x != 0)
        {
            System.out.println("Odd number in Array is: "+ x );
        }
    }

}
