public class MaximumPopulationYear{
    public static void main(String[] args) {
        int[][] logs = { { 1950,1961}, { 1960,1971 }, { 1970,1981 } };
       int[] arr = new int[101];
       for (int i = 0; i < logs.length; i++) {
        arr[logs[i][0]-1950]++;
        arr[logs[i][1]-1950]--;
        
       }
       for (int i = 1; i < arr.length; i++) {
        arr[i] += arr[i - 1]+arr[i];
        
       }
       int max=0,year=1950;
       for (int i = 0; i < arr.length; i++) {
        if ( arr[i] > max ) {
            max = arr[i];
            year = 1950+i;
            
        }
        
       }
       System.out.println("The maximum population year is " + year);
        
    }
   
      
}