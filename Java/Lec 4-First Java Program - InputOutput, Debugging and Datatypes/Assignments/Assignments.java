import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {

    //         // Question 1: Write a program to print whether a number is even or odd, also take input from the user.
  
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter an integer: ");
    // int num = input.nextInt();
    // if (num % 2 == 0) {
    //     System.out.println("Number is Even");
    // }else{
    //     System.out.println("Number is odd");
    // }


    // // Question 2: Take name as input and print a greeting message for that particular name.

    // Scanner scn = new Scanner(System.in);
    // System.out.print("Please enter your name : ");
    // String name = scn.nextLine();
    // System.out.printf("Hello "+ name + " Welcome!");



//     // Question 3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

// Scanner input = new Scanner(System.in);
// System.out.println("Enter Principal:");
// double p = input.nextDouble();
// System.out.println("Enter Time in years:");
// double t = input.nextDouble();
// System.out.println("Enter Rate of interest:");
// double r = input.nextDouble();
// double SimpleInterest = (p * t * r) / 100;

// System.out.println("The simple interest rate is " + SimpleInterest);



    //    // Question 4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Enter First Number: ");
    //    int x = input.nextInt();
    //    System.out.println("Enter the Operator: ");
    //    char operator = input.next().charAt(0);
    //    System.out.println("Enter the second number: ");
    //    int y = input.nextInt();
    //    if (operator=='-') {
    //     System.out.println("Result= " + (x - y));
    //    }
    //     else if (operator == '+') {
    //        System.out.println("Result= " + (x + y));
    //    } 
    //    else if (operator == '/') {
    //        if (y != 0) {
    //            System.out.println("Result=" + (x / y));
    //        } else {
    //            System.out.println("Error! Division by zero not allowed.");
    //        }
    //    }
    //     else if (operator == '*') {
    //        System.out.println("Result=" + (x * y));
    //    }
    //     else {
    //        System.out.println("Invalid operator");
    //    }
        

    //  // Question 5: Take 2 numbers as input and print the largest number.

    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter First Number: ");
    // int num1 = input.nextInt();
    // System.out.println("Enter Second Number: ");
    // int num2 = input.nextInt();
    // if (num1 > num2) {
    //     System.out.println("number 1 is greater than number 2");
    //     } else if (num2 > num1) {
    //         System.out.println("Number 2 is greater than number 1");
    //         } else {
    //             System.out.println("Both numbers are equal");
    //         }

    //  // Question 6: Input currency in rupees and output in USD.

    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter amount of money in Rupees : ");
    //     float Rs = input.nextFloat();
    //     float usd = Rs/279;
    //     System.out.println("Your Given Amount " +Rs+ " converted in USD is "+usd);

    // // Question 7: To calculate Fibonacci Series up to n numbers.
    // Scanner input = new Scanner(System.in);
    // System.out.print("How many terms do you want in fibonacci series? ");
    // int n = input.nextInt();
    // int a=0,b=1,c;
    // System.out.println("Your Fibonacci series :");
    // for(int i=1;i<=n;++i){
    //     System.out.print(a+"\t");
    //     c=a+b;
    //     a=b;
    //     b=c;
    //     }  
    

    // // Question 8: To find out whether the given string is Palindrome or not.
       
    // Scanner input = new Scanner(System.in);
    // String str = input.nextLine();

    // String rev = "";

    // for (int i = str.length()-1; i >=0; i--) {

    //     rev = rev + str.charAt(i);
        
    // }

    // if (str.equals(rev)) {
    //     System.out.println("String is palindrome");
    // }
    // else{
    //     System.out.println("String is not palindrome");
    // }


//     // Question 9: To find Armstrong Number between two given number.
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Enter first number: ");
//     int num1 = scanner.nextInt();

//     System.out.print("Enter second number: ");
//     int num2 = scanner.nextInt();

//     for (int i = num1; i <= num2; i++) {
//         int sum = 0;
//         int temp = i;

//         while (temp != 0) {
//             int r = temp % 10;
//             sum += r * r * r;
//             temp /= 10;
//         }

//         if (sum == i) {
//             System.out.println(i + " is an Armstrong number");
//         }
// }

}
}
