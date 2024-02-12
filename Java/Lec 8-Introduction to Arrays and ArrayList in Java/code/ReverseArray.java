package code;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {7,8,9};
        System.out.println("Original Array:");
        printArray(array);

        
        reverseArray(array);
        System.out.println("\nReversed Array:");
        printArray(array);

    }
static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + "  ");
    }
}

    static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            // Swapping the elements
            swap(array, start, end);
        start++;
        end--;
        }


    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
