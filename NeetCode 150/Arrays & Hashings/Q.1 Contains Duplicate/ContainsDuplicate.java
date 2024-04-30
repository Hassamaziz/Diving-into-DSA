import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
 
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
    Arrays.sort(nums);
        System.out.println("Array contains duplicate elements? " + hasDuplicate(nums));
        
    }
    static boolean hasDuplicate(int[] nums){
        
        if (nums == null || nums.length <= 1 ) return false;
        
        int n = nums.length;
        // Brute Force Solution
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++)
        //         if(nums[i]==nums[j]) return true;
        // }
        // return false;
        /* Optimized solution using a set */
        Set<Integer> uniques = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            if (uniques.contains(nums[i])){
                return true;
        }
        uniques.add(nums[i]);
    }
    return false;
    }

}