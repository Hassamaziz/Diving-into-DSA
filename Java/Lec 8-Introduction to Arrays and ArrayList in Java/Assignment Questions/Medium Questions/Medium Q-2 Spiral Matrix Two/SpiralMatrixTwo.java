import java.util.Arrays;

public class SpiralMatrixTwo {
    public static void main(String[] args) {
        // Spiral Matrix 2 : Given an m x n
        int n = 1;
          int[][] res= printSpiralOrder(n); 
          System.out.println( "Output Matrix:");
          for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
          }  
         
    }
    static int[][] printSpiralOrder(int n) {
        int[][] res=new int[n][n];
        int count=1;
        int left=0,right=n-1,top=0,bottom=n-1;
      
          while(top<=bottom && left<=right){
              for(int i=left;i<=right;i++){
                 res[top][i]=count++;
              }
              top++;
              for(int i=top;i<=bottom;i++){
                  res[i][right]=count++;
              }
              right--;
              for(int i=right;i>=left;i--){
                  res[bottom][i]=count++;
              }
              bottom--;
              for(int i=bottom;i>=top;i--){
                  res[i][left]=count++;
              }
              left++;
              
          }
          return res;

    }
    
}
