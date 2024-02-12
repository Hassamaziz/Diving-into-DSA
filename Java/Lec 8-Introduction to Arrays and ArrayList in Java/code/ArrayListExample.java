package code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(34);
        // list.add(674);
        // list.add(34644);
        // list.add(243434);
        // list.add(87634);
        // list.add(34);
        // list.add(674);
        // list.add(34644);
        // list.add(243434);
        // list.add(87634);
        // list.add(34);
      

        // System.out.println(list); 

        // System.out.println(list.contains(34));

        // list.set(0, 69);

        // System.out.println(list); 

        // list.remove(4);

        // System.out.println(list);



        // Input and Output of ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i < 7; i++) {
        arr.add(input.nextInt());
    }


    // Output 
    for (int i = 0; i < 7; i++) {
        System.out.print(arr.get(i) + "   ");
    }
        

    }
}
