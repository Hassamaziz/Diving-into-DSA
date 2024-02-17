public class FindTheHighestAltitude {
        public static void main(String[] args) {
            //  Find the Highest Altitude
    //      There is a biker going on a road trip. The road trip consists of n + 1 points
    //      at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

    // You are given an integer array gain of length n where
    //  gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n)
    //   Return the highest altitude of a point.
    int[] gain = new int[]{-4,-3,-2,-1,4,3,2};
    System.out.println("The highest altitude is: " + findHighestAltitude(gain));
        } 
        static int findHighestAltitude(int[] gain) {
            int max = 0; 
           int[] temp = new int[(gain.length+ 1)]; 
           temp[0]=max; 
           for(int i=1;i<temp.length;i++) {
               max = max + gain[i-1];
               temp[i]=max;

             }
               
           return findMax(temp);  
    }  
    static int findMax(int[] temp) {
        int maxIndex = 0; 
        
        for(int i=1;i<temp.length;i++) {
          if(temp[i] > temp[maxIndex]) {
              maxIndex = i;  
          }
        }
       return temp[maxIndex];

    }
  
}
