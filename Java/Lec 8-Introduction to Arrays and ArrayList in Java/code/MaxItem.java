package code;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {23,5,74,2,5,6};
        System.out.println(maxItem(arr));
    }
    static int maxItem(int[] arr){  
        if (arr == null || arr.length <= 1) return -1;
        int maxVal = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i])
             {
                 maxVal = arr[i];
            }
            

        }


        return maxVal;


    }
}
