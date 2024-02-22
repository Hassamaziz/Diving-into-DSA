import java.util.Arrays;

public class AddtoArray {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;
        int[] res = (addToArrayForm(num,k));
        System.out.println(Arrays.toString(res));
    }

    static int[] addToArrayForm(int[] num, int k) {
        int[] array = new int[num.length];
        int totalnum = 0;
        int totalsum = 0;

        for (int i = 0; i < num.length; i++) {
            totalnum = totalnum *10 + num[i]; 
        }
        totalsum = totalnum+k;
        for (int i = num.length-1; i>=0; i--) {
            array[i] = totalsum % 10;
            totalsum /= 10; 
            
        }
        return array;

       
    }

}