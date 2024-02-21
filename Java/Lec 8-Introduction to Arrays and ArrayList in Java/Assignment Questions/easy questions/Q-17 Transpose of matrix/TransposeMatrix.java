import java.util.Arrays;

public class TransposeMatrix{
   public static void main(String[] args) {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] matrix2 = (findTranspose(matrix));
    for (int i = 0; i < matrix.length; i++) {
        System.out.println(Arrays.toString(matrix2[i]));
        
    }
   }
   static int[][] findTranspose(int matrix[][]) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    int[][] transpose = new int[columns][rows];
    // Transposing the matrix by switching rows and columns
    for (int i = 0; i < rows; ++i)
        for (int j = 0; j < columns; ++j)
            transpose[j][i] = matrix[i][j];
    
    return transpose;
   }
    
}