import java.util.Arrays;

public class RemoveDulpicates {
    public static void main(String[] args) {
        // Given an integer array nums sorted in non-decreasing order,
        //  remove the duplicates in-place such that each unique element
        //   appears only once. The relative order of the elements should
        //    be kept the same. Then return the number of unique elements in nums.

        // Consider the number of unique elements of nums to be k, to get accepted,
        // you need to do the following things:

        // Change the array nums such that the first k elements of nums contain the
        // unique elements in the order they were present in nums initially.
        // The remaining elements of nums are not important as well as the size of nums.
        // Return k.
        // Custom Judge:

        // The judge will test your solution with the following code:

        // int[] nums = [...]; // Input array
        // int[] expectedNums = [...]; // The expected answer with correct length

        // int k = removeDuplicates(nums); // Calls your implementation

        // assert k == expectedNums.length;
        // for (int i = 0; i < k; i++) {
        //     assert nums[i] == expectedNums[i]
        // }
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
      
        int k = removeDuplicates(nums);
        System.out.println("Output : " + k);
      
    }
    static int removeDuplicates(int[] nums){
        int k=nums.length;
        if(k==0 || k==1)return k;
        int j=0;
        for(int i=1;i<k;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
        
      
    }
    
}
