public class GoodPairs {
    public static void main(String[] args) {
        // Given an array of integers nums, return the number of good pairs.
        // A pair (i, j) is called good if nums[i] == nums[j] and i < j.
        int[] nums = new int[]{1,1,1,1};
        System.out.println("Number of good pairs: " + countGoodPairs(nums));
    }
    static int countGoodPairs(int[] nums) {
        // Create a frequency count of the elements in the array.
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]==nums[j]&&i<j){
                    count++;
                }
                
            }
        }

        return count ;
    }
}
