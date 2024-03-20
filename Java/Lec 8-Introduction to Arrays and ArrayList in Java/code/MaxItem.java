package code;

import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {23,5,74,2,5,6};


                    //  To find max 

        System.out.println("Enter the range from where you want to see the maximum value : ");
        int start = input.nextInt();
        int end = input.nextInt();
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(maxInRange(arr, start, end));
        }



        // System.out.println(maxItem(arr));
    }



     static int maxInRange(int[] arr,int a,int b){  
        
        int maxVal = arr[a]; 
        for (int i = a; i <= b; i++) {
            if (maxVal < arr[i])
             {
                 maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // static int maxItem(int[] arr){  
    //     if (arr == null || arr.length <= 1) return -1;
    //     int maxVal = arr[0]; 
    //     for (int i = 0; i < arr.length; i++) {
    //         if (maxVal < arr[i])
    //          {
    //              maxVal = arr[i];
    //         }
    //     }
    //     return maxVal;
    // }
}
