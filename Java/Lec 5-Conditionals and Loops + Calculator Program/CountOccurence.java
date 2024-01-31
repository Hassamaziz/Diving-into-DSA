import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check from: ");
        int num = input.nextInt();
        System.out.println("Enter the number to count:");
        int chk = input.nextInt();

        int count = 0;

        while (num>0) {
            int rem =  num % 10;
            if (rem == chk) {
             count++;
            }
            num = num/10;
        }

        System.out.println("The number of occurences of " + chk  + " are "+ count);
    }
}
