import java.util.Arrays;

public class ConcatinationOfArray{
    public static void main(String[] args) {
        // Concatination of Array
        int[] nums = {1,2,1};
        System.out.println("Original array:");
        
        System.out.println(Arrays.toString(nums));

      int ans[]= concatinateArray(nums);
      System.out.println("\nConcatenated array: ");
      
      System.out.println(Arrays.toString(ans)); 
    }
    static int[] concatinateArray(int [] nums){
        int n =2*nums.length;  
        int [] ans = new int[n]; 
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];              
            ans[i+nums.length] = nums[i];

            
        }  
        return ans;
                   
        
    }

}