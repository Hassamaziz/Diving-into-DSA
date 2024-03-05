import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        // You are given a large integer represented as an integer array digits,
        //  where each digits[i] is the ith digit of the integer. The digits are
        //   ordered from most significant to least significant in left-to-right
        //    order. The large integer does not contain any leading 0's.
        // Increment the large integer by one and return the resulting array of digits.
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Before: " + Arrays.toString(digits));
        int[] newDigits= addOne(digits);
        System.out.println("After: " + Arrays.toString(newDigits));

    }
    static int[] addOne(int[] digits){
       
       for (int i = digits.length-1; i >=0; i--) {
        if (digits[i] <9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
        
       }
       int[] res = new int [digits.length+1];
       res[0]=1;
       
       return res;
        
      
     
      
        
    }
    
}
