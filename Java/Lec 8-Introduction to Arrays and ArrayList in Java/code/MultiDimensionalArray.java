package code;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] MultiArr =  
                 { {0,1,2,3},
                   {4,5,6,7},
                   {8,9,10,11}};


        // Inputs 
        int [][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
                
            }
           
            
        }


                       // Displaying array 

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //       System.out.print(arr[row][col] + " ");
                
        //     }
            
        // }

                    //  Enhanced way of displaying


                   
                    // for (int row = 0; row < arr.length; row++) {
                    //     System.out.println(Arrays.toString(arr[row])); 
                    // }

                    // enhanced for loop 
               for(int[] a: arr){
                System.out.println(Arrays.toString(a));
               }


    }
}
