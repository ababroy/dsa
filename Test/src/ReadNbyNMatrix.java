import java.util.Scanner;

/**
 * =====n*n Matrix=====
 * 
 * Read the number of rows
 * Read the number of columns
 * Enter the elements for matrix
 * Display the elements in the matrix
 * 
 * @author AROY
 *
 */
public class ReadNbyNMatrix
{
    public static void main ( String[] args )
    {
        // 2 * 2 matrix, rows=2, col=3, 1234,
        int row = 0, col = 0;
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter the no of rows in matrix" );
        row = scan.nextInt();
        System.out.println( "Enter the no of columns in matrix" );
        col = scan.nextInt();

        int matrix[][] = new int[ row ][ col ];
        System.out.println( "Enter the elements of the matrix" );

        // row
        for ( int i = 0; i < row; i++ )
        {
            // col
            for ( int j = 0; j < col; j++ )
            {
                matrix[ i ][ j ] = scan.nextInt();
            }
        }
        System.out.println( "Display the elements of the matrix" );

        // row
        for ( int i = 0; i < row; i++ )
        {
            // col
            for ( int j = 0; j < col; j++ )
            {
                System.out.print( matrix[ i ][ j ]+" " );
            }
            System.out.println(  );
        }
    }
}
