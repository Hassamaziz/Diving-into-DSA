import java.util.Arrays;

public class UniqueKeySumZero {
    public static void main(String[] args) {
        // Given an integer n, return any array containing n unique integers such that they add up to 0.
        int n = 5;
        System.out.println("Array of " + n + " elements which adds up to zero: ");
        int[] arr = (printNUniqueElementsAddingUpToZero(n));
        System.out.println(Arrays.toString(arr));

        
    }
    static int[] printNUniqueElementsAddingUpToZero(int n){
        int[] arr = new int[n];
        int left=-n/2;
        
        if (n%2!=0) {
        for (int i = 0; i < arr.length; i++) {
           arr[i]=left;
            left++;
          } 
    }
    else{
        for (int i = 0; i < arr.length; i++) {
            if(left==0){
                left++;
            }
            arr[i] = left;
            left++;
    }
       
      
}
       
        return arr;
       
    }
   
    
}
