import java.util.Arrays;

public class MostCandies {
 public static void main(String[] args) {
  
    //     There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
    //  and an integer extraCandies, denoting the number of extra candies that you have.
    // Return a boolean array result of length n, where result[i] is true if,
    //  after giving the ith kid all the extraCandies, 
    // they will have the greatest number of candies among all the kids, or false otherwise.
            int[] candies = {2,3,5,1,3};
            int extraCandies = 3;
            boolean[] res = kidsWithTheLargestNumberOfCandies(candies,extraCandies);
            System.out.println(Arrays.toString(res));
 }    
 static boolean[] kidsWithTheLargestNumberOfCandies(int[] candies, int extraCandies){
    int max= findMax(candies);

    boolean[] res = new boolean[candies.length];

   for (int i = 0; i < candies.length; i++) {
      candies[i] = candies[i]+extraCandies;
      res[i] = candies[i]>=max;
   }

    return res;
 }
 static int findMax(int[] candies){
    int max = candies[0];
    for (int i = 1; i < candies.length; i++){
      if(max<candies[i]){
        max = candies[i];
      }
    }
    return max;
 }
}
