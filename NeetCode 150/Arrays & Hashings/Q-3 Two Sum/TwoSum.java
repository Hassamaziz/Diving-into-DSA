import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int arr[] = new int[]{44, 2, 11, 15};
        int target = 17;
        System.out.println("Indexes of the two elements whose sum are " + target);
        printIndicesOfTwoElements(arr, target);
    }
    static void printIndicesOfTwoElements(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(target - arr[i])){
                System.out.print("Pair ("+map.get(target-arr[i])+" , "+i+") ");
            }else{
                map.put(arr[i], i);
            }
        }
    


    }
}