import java.util.ArrayList;

public class SpiralMatrixOne {
    public static void main(String[] args) {
        // Given an m x n matrix, return all elements of the matrix in spiral style order
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Spiral Order: ");
        ArrayList<Integer> res= new ArrayList<>(printSpiralOrder(matrix)); 
        for (int i : res){
            System.out.print(i + " ");
        }
    }
    
    static ArrayList<Integer> printSpiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int left = 0, up = 0, right = m - 1, down = n - 1;
        while (res.size() < n * m) {
            for (int i = left; i <= right && res.size() < n * m; i++) res.add(matrix[up][i]);
            for (int i = up + 1; i <= down && res.size() < n * m; i++) res.add(matrix[i][right]);
            for (int i = right - 1; i >= left && res.size() < n * m; i--) res.add(matrix[down][i]);
            for (int i = down - 1; i > up && res.size() < n * m; i--) res.add(matrix[i][left]);
            left++;
            up++;
            right--;
            down--;
        }
        return res;
    }
}
