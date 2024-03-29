import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        // Shuffling an array
       

        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Shuffling Array : ");
       int[] ans = shuffleArray(nums, n);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] shuffleArray(int[] nums,int n){
        int [] ans = new int[nums.length];
        // Shuffling the nums array 
         // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].  Return the array in the form [x1,y1,x2,y2,...,xn,yn]
        
         int secondStart = n+1;
         for (int i = 0 ;i < n ; i++ ) {
            ans[2*i] = nums[i];
            ans[(2*i)+1]=nums[i+n];
             
            
         }
     return ans;
}
}
