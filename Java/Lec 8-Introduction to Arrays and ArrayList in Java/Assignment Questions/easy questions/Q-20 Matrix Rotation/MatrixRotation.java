import java.util.Arrays;

public class MatrixRotation {
public static void main(String[] args) {
    // Determine Whether Matrix Can Be Obtained By Rotation
    // Given two n x n binary matrices mat and target, return true if it is possible to make mat equal
    //  to target by rotating mat in 90-degree increments, or false otherwise.
    int[][] mat = {{0,0,0}, {0,1,0},{1,1,1}};
    int[][] target = {{1,1,1}, {0,1,0},{0,0,0}};
    System.out.println(canBeObtained(mat, target));
}
static boolean canBeObtained(int[][] mat, int[][] target) {
    int c90=0,c180=0,c270=0,c360 = 0;
    int n  = mat.length;
    for (int i = 0; i <n;i++) {
        for (int j = 0; j < n; j++) {
            if (target[i][j]==mat[n-j-1][i]) {
          
                c90++;  }
                if (target[i][j]==mat[n-i-1][n-j-1]) {
              
                c180++;
             }
                if (target[i][j]==mat[j][n-i-1]) {
                   
                c270++;
            }
                if (target[i][j]==mat[i][j]) {
                  
                c360++;  
               }       
        }
        
    }
    if (c90==n*n||c180==n*n||c270==n*n||c360==n*n) {
        return true; }
        else return false;
   
    
   
    
   
}

}
