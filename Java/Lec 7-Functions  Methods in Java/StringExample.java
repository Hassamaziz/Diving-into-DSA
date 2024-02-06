import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
    //   System.out.println(example());
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String userName = input.nextLine();
    System.out.println(myGreet(userName));

   
    // System.out.println(myGreet("Hassam"));

    

    }

    

   static String myGreet(String name) {
       String message = "Hello " + name;
       return message;
    }



    static String example(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();

        return str1;
    }
}
