import java.util.Arrays;

public class CreateTargetArray {
        public static void main(String[] args) {
                                // Create Target Array in the Given Order
          // Given two arrays of integers nums and index. Your task is to create target array under
        //    the following rules:
        //  Initially target array is empty.
         // From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in 
        //  target array.
        //    Repeat the previous step until there are no elements to read in nums and index.
        //   Return the target array.                     
        // It is guaranteed that the insertion operations will be valid.
        int []nums = new int[]{0,1,2,3,4};
        int []index = new int[]{0,1,2,2,1};

        int[] target = new int[nums.length];
        target = createTargetArr(nums, index);
        System.out.println(Arrays.toString(target));
        

        }  
        static int[] createTargetArr(int[] nums, int[] index){
            int n=nums.length;
            
            int[] target = new int[n];

            for (int i=0; i<n; i++){

                if(index[i]==i) target[index[i]] = nums[i];
                else{
                    for (int j = index[i]; j < i+1; j++) {
                        int temp = target[j];
                        target[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
            return target;

        }  
}
