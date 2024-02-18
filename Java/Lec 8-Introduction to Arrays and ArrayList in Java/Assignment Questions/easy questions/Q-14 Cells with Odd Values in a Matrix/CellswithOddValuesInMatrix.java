import java.util.Arrays;

public class CellswithOddValuesInMatrix {
    public static void main(String[] args) {
        // Cells with Odd Values in a Matrix
    //     There is an m x n matrix that is initialized to all 0's.
    //      There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed
    //       location to perform some increment operations on the matrix.

    //     For each location indices[i], do both of the following:

    //     Increment all the cells on row ri.
    //     Increment all the cells on column ci.
    //     Given m, n, and indices, return the number of odd-valued cells in the 
    // matrix after applying the increment to all locations in indices.
    int m = 2;
    int n = 3;
    int[][] indices = {{0, 1}, {1, 1}};
    System.out.println("Number of odd value cells : " + countOddCells(m, n, indices));

    
}
static int countOddCells(int m, int n, int[][] indices){
    int count = 0;
    int[][] matrix = new int[m][n];
   int[] r = new int[m];
   int[] c = new int[n];
   for (int i=0; i<indices.length; i++){
       r[indices[i][0]]++;
       c[indices[i][1]]++;
   }
   for (int i=0; i<m; i++){
    for (int j = 0; j <n; j++) {
        matrix[i][j] = r[i]+c[j];
        if (matrix[i][j] % 2 != 0)
            count++;
    }
        
    }
    System.out.println(Arrays.deepToString(matrix));

    return count;
}
}
