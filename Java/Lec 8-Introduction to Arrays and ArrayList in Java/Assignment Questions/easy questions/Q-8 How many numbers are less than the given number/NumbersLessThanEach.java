import java.util.Arrays;

public class NumbersLessThanEach{
    public static void main(String[] args) {
        // How Many Numbers Are Smaller Than the Current Number
        // Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
        //  That is, for each nums[i] you have to count the number of valid j's such that j != i
        //  and nums[j] < nums[i].
        //   Return the answer in an array.
        int []nums = {8,1,2,2,3};
       
        
        int[] result = new int[nums.length];
        result =numbersLessThan(nums);
        System.out.println(Arrays.toString(result));
       


    }
    static int[] numbersLessThan(int[] nums) {
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int counter = 0;
            for (int j=0; j<nums.length; j++){
                if (j!=i && nums[j]<nums[i]) counter++;
            }
            result[i]=counter;
        }

        return result;
    }
}