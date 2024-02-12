import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {23,56,2,567,24,76};
        System.out.println("Before swapping:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
           System.out.println();

        System.out.println("Enter the indexes that you want swapped : ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();


       
        
      

       

        swap(arr,index1,index2);
        System.out.println("\nAfter swapping:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
