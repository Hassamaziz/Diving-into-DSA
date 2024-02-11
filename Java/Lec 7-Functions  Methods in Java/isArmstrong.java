import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = input.nextInt();
        // System.out.println(isArmstrong(num));

                        // Printing all 3 digit armstrong numbers
                        for (int i = 100; i < 1000; i++) {
                            if (isArmstrong(i)) {
                                System.out.print(i + "  ");
                            }
                        } 

    }
    static boolean isArmstrong(int num){
        int sum = 0;
        int original = num;
        while (num!=0) {
            int lastDigit = num%10;
            num /= 10;
            sum = sum + lastDigit*lastDigit*lastDigit ;

        }
       return sum == original;
    }
}
