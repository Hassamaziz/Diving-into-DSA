package code;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(34);
        list.add(674);
        list.add(34644);
        list.add(243434);
        list.add(87634);
        list.add(34);
        list.add(674);
        list.add(34644);
        list.add(243434);
        list.add(87634);
        list.add(34);
      

        System.out.println(list); 

        System.out.println(list.contains(34));

        list.set(0, 69);

        System.out.println(list); 

        list.remove(4);

        System.out.println(list);
        

        

    }
}
