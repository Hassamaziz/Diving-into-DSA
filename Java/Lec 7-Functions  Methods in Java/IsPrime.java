import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num) {
        if (num <= 1 ) return false; 
        int c = 2;
        while (c*c <= num) {
            if (num % c == 0) return false;
            c++; 
        }
        return c*c > num;
    }
}
