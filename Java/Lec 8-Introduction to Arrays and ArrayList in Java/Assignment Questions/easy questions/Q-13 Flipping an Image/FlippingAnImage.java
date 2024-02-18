import java.util.Arrays;
import java.util.Collections;

public class FlippingAnImage {
    public static void main(String[] args) {
        // Given an n x n binary matrix image, flip the image horizontally, then invert it,
        //  and return the resulting image.

        // To flip an image horizontally means that each row of the image is reversed.

        // For example, flipping [1,1,0] horizontally results in [0,1,1].  
        // To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        // For example, inverting [0,1,1] results in [1,0,0].  
        int[][] img = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1},{1,0,1,0}};
        
        int[][] result = flipAndInvertImage(img);
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
              System.out.print(result[row][col] + "  ");
                
            }
            
        }
    }
    static int[][] flipAndInvertImage(int[][] img){
      for (int i = 0; i < img.length; i++) {
        int start = 0;
        int end = img[i].length - 1;
        while (start < end) {
            int temp = img[i][start];
            img[i][start] = img[i][end];
            img[i][end] = temp;
            start++;
            end--;
        }
    }
        int rows = img.length;
        int cols = img[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
               if (img[i][j]==0) {
                img[i][j]=1;
               }
               else{
                img[i][j]=0;
               }
              }
        
    }return img;
  }
  
  
}
