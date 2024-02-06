import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // sum();
        // sum();
        // sum();
        // sum();

        // System.out.println(sum2());

        int ans = sum3(99, 1);
        System.out.println(ans);

    }

    static int sum3(int a ,int b){
        int sum = a + b;
        return sum;
    }

   static void sum(){
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }

    static int sum2(){
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        sum=num1+num2;
        return sum;
    }
}