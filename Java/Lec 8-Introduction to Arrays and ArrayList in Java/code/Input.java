package code;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("enter 5 integers : ");
        for (int i=0 ;i<arr.length ;i++) {
        arr[i] = input.nextInt();
    }

    System.out.println( "The entered numbers are:");
    
    //displaying the array

    // Advanced for loop for displaying 
    for(int num:arr){
        System.out.print(num + " ");
    }


// for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i]+" ");
    
// }

    // System.out.println(Arrays.toString(arr));
}
}
