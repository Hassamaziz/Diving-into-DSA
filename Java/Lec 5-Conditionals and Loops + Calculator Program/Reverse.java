import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;

        while (num>0) {
            int rem = num%10;
            ans = ans*10 + rem;
            num /= 10;
        }
        System.out.println("The Reverse of given number is "+ans);
    }
}
