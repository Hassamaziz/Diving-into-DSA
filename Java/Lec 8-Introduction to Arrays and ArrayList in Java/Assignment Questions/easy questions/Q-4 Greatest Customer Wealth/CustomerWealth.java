public class CustomerWealth {
   public static void main(String[] args) {
    int[][] customers = {{1,5},{7,3},{3,5}};
    // adding each cutomer's wealth and seeing who is richest
    System.out.println(getRichCustomer(customers)); 

   }    
   static int getRichCustomer(int[][] customerWealth){
    int ans = 0;
   for (int i = 0; i < customerWealth.length; i++) {
    int Rowsum=0;
    for (int j = 0; j < customerWealth[i].length; j++){
      Rowsum+=customerWealth[i][j];
    
   }
   if(Rowsum > ans)
     ans=Rowsum;
   }

    return ans;    

   }
}
