import java.util.ArrayList;

public class MaxSubArray {
        public static void main(String[] args) {
            // Given an integer array nums, find the subarray with the largest sum, and return its sum
            int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
            System.out.println("Subarray with largest sum: ");
             System.out.println(maxSubArray(nums));
           

        }    
        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
           
            
            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            return maxSum;
        

            }

}