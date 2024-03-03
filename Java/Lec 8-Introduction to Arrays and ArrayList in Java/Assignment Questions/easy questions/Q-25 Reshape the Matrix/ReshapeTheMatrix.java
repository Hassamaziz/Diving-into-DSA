import java.sql.Array;
import java.util.Arrays;

public class ReshapeTheMatrix {
    // Reshape the Matrix
    //  In Meaning, there is a handy function called reshape which can reshape
    //  an m x n matrix into a new one with a different size r x c keeping its original data.

    //  You are given an m x n matrix mat and two integers r and
    //  c representing the number of rows and the number of columns of the wanted reshaped matrix.

    //  The reshaped matrix should be filled with all the elements
    //  of the original matrix in the same row-traversing order as they were.

    //  If the reshape operation with given parameters is possible
    //  and legal, output the new reshaped matrix; Otherwise, output the original matrix
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
    int r=1;
    int c=4;
    System.out.println("Original Matrix:");
    for (int i = 0; i < mat.length; i++) {
        System.out.println(Arrays.toString(mat[i]));
    }
    int[][] result = reshape(mat,r,c);
   
      System.out.println("\nReshaped Matrix:");
      for (int i = 0; i < result.length; i++) {
        System.out.println(Arrays.toString(result[i]));  
        }
    
    }
   
    static int[][] reshape(int[][] matrix ,int r,int c) {
        int[][] reshaped = new int[r][c];
        int row = matrix.length;
        int col = matrix[0].length;
        if (row*col!=r*c) {
            return matrix; 
        }
        int new_row = 0;
        int new_col = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++ ) { 
                if (new_col == c) {
                    new_col = 0;
                    new_row++;
                }
                reshaped[new_row][new_col] = matrix[i][j];
                new_col++;
               
            }
        }

       
        
        return reshaped;
     
    }


    
}
