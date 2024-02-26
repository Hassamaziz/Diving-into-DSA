import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
 
    public static void main(String[] args) {
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
       
     // //     Two Sum   Brute Force
    //     int[] nums = {3,2,3};
    //     int target = 6;
    //     ArrayList<Integer> indexes = new ArrayList<Integer>();
    //     int firstIndex  = 0;
    //     while (firstIndex<nums.length) {
    //         for (int i = 1; i < nums.length; i++) {
    //             if ((nums[i] + nums[firstIndex]) == target && i != firstIndex) {
    //                 indexes.add(firstIndex);
    //                 indexes.add(i);
    //                 break;
    //              }
            
    //     }
    //     firstIndex++;
    // }
    //     for (int i = 0; i < indexes.size(); i++) {
    //         System.out.print(indexes.get(i)+" ");
    //     }


    // Optimized Two Sum 
    int[] nums = {3,2,3};
    int target = 6;
    for (int i = 1; i < nums.length; i++) {
        for (int j = i; j < nums.length; j++) {
            if (nums[j-i]+nums[j] == target) {
                System.out.println("The indexes are " + (i-j) + " and " + j); 
            }
            
        }
        
    }

         
     }    
}
