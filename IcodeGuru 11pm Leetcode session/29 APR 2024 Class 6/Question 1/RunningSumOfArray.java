public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println("Input array: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nRunning sum of the array elements is:");
        runningSum(nums);
    }
    static void runningSum(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.print(sum + " ");
            
        }
    }
    
}
