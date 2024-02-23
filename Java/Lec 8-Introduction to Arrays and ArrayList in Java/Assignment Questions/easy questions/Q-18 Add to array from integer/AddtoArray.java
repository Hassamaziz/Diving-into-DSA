import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddtoArray {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        ArrayList<Integer> res = new ArrayList<>(addToArrayForm(num,k));
        System.out.println("The result is: " + Arrays.toString(res.toArray()));
       
    }

    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
      ArrayList<Integer> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }

        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }

        return list;


       
    }

}