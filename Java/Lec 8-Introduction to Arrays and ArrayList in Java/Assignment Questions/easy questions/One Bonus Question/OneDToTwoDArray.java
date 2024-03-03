import java.util.Arrays;

public class OneDToTwoDArray {
    public static void main(String[] args) {
        // You are given a 0-indexed 1-dimensional (1D) integer array original,
        //  and two integers, m and n. You are tasked with creating a 2-dimensional
        //   (2D) array with  m rows and n columns using all the elements from original.

        // The elements from indices 0 to n - 1 (inclusive) of original should form the 
        // first row of the constructed 2D array, the elements from indices n to 2 * n - 1
        // (inclusive) should form the second row of the constructed 2D array, and so on.

        // Return an m x n 2D array constructed according to the above procedure, or an    
        // empty 2D array if it is impossible.
        int[] original = {1,2,3,4};
        int r=2;
        int c=2;
        int[][] result=TwoDimensionalArr(original,r,c);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
            
        }

    }
    static int[][] TwoDimensionalArr(int[] original,int r,int c){
        // Brute force

    //     int l=original.length;
    //     int[][] result=new int[r][c];
    //      int rows= 0;
    //      int cols= 0;

    //    if (r*c==l) {

       
    //     for (int i = 0; i < l; i++) {
    //         result[rows][cols]=original[i];
    //         cols++;
    //         if (cols==c) {
    //             cols=0; 
    //             rows++;
               
    //         }
    //     }
    
    //      return result;
    //     }
    //     else{
    //        return new int[0][0];  
    //     }


    // Optimized

    int l=original.length;
    if(l!=r*c) return new int[0][];
   int index=0;
    int [][] res=new int[r][];
    for(int i=0;i<r;i++){
        res[i]=new int[c];
        for(int j=0;j<c;j++){
            res[i][j]=original[index++];
        }
    }
    return res;
    
    }
    
}
