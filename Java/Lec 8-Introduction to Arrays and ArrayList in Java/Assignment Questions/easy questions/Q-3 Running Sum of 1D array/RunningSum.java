public class RunningSum {
    
    public static void main(String[] args) {
        // Running sum of 1D array
        int[] nums = {1,1,1,1,1};
        System.out.println("Running Sum: ");
        runningSum(nums);
    }
     static void runningSum(int[] arr){
        if (arr == null || arr.length == 0) return;
        
         int sum = 0;
        

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.print(sum + " ");
        }

     }
}
