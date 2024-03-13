public class CostOfMovingChips {
    public static void main(String[] args) {
        // We have n chips, where the position of the ith chip is position[i].
        // We need to move all the chips to the same position.
        // In one step, we can change the position of the ith chip from position[i] to:
        // position[i] + 2 or position[i] - 2 with cost = 0.
        // position[i] + 1 or position[i] - 1 with cost = 1.
        // Return the minimum cost needed to move all the chips to the same position.
        int[] positions = new int[]{1,100000};
        System.out.println("Minimum cost to move all chips to the same place is " + minCostToMoveAllChips(positions));
        

    }
    static int minCostToMoveAllChips(int[] positions) {
        if (positions == null || positions.length == 0) return 0;
        int e=0;
        int o=0;
        for (int i : positions){
            if (i%2==0) {
                e++;
            }
            else{
                o++;
            }
        }
        return Math.min(e,o);

    }
    
}
