package code;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // Initialization 
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }

        //  Displaying the lists
        System.out.println(list);
    }
}
