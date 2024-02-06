import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
      System.out.println(example());

    }
    static String example(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();

        return str1;
    }
}
