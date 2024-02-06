import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        ChangeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void ChangeValue(int[] nums){
        nums[0]=24;
    }
}
