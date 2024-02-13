public class CreateAnArrayFromPermutation{
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println("Nums Array: ");
        for (int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
        
        
        createArr(nums);

        
    }
    static void createArr(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        System.out.println("New Array From Permutation:");
       for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] +" ");
        
       }
    }

}