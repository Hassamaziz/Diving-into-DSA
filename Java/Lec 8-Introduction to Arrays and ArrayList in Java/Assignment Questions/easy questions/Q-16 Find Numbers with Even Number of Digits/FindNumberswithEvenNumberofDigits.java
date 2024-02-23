public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        // Find Numbers with Even Number of Digits
        // Given an array nums of integers, return how many of them contain an even number of digits.
        int[] nums = new int[]{12, 35, 22244444, 6789};
        System.out.println("Count of numbers with even number of digits: " + findNumbersWithEvenNumberOfDigits(nums));
    }
    static int findNumbersWithEvenNumberOfDigits(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int digit = 0;
            while (n > 0){
                n /= 10;
                digit++;
            }
            if(digit % 2 == 0)
                count++;
        }
        return count;

    } 
}
