import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Scanner;

public class IntermediatePrograms {
    public static void main(String[] args) {
        // // Question 1:Factorial Program In Java
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number to calculate its factorial : ");
        // int num = input.nextInt();
        // long fact = 1;
        // for (int i = 1; i <= num; ++i) {
        //     fact *= i;
        // }
        // System.out.println("The Factorial of " + num + " is : " + fact);


        // //  Question 2:Calculate Average Of N Numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("How many numbers do you want to enter?");
        // int n = sc.nextInt();
        // double sum = 0;
        // System.out.println("Enter the numbers one by one:");
        // for (int i = 1; i <=n ; i++) {
        //     double num = sc.nextDouble();
        //     sum += num;
        // }
        // double avg = sum / n;
        // System.out.printf("The average of %d numbers is %.2f", n, avg);


        // // Question 3:Armstrong Number In Java
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check if it's an Armstrong number or not : ");
        // int num = sc.nextInt();
        // System.out.print("Give number of digits in number : ");
        // int digitCount = sc.nextInt();
        // int rem, sum = 0, l = num;
        // while (l != 0) {
        //     rem = l % 10;
        //     sum += Math.pow(rem,digitCount);
        //     l /= 10;
            
        // }
        // if (sum == num)
        //     System.out.println(num + " is an Armstrong number.");
        // else
        //     System.out.println(num + " is not an Armstrong number.");
    


        // // Question 4: Reverse A String In Java
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string : ");
        // String str = sc.nextLine();
        // String rev = "";
        // for (int i = str.length()-1; i >=0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println("Reversed String : "+rev);




        // //  Question 5: Find if a number is palindrome or not
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num = sc.nextInt();
        // int rem =0;
        // int originalNumber = num;
        // int reverse = 0;
        // while (true) {
        //     rem =num%10;
        //     reverse =reverse*10+rem;
        //     num/=10;
        //     if(num==0){
        //         break;
        //     }
        // }
        // if (originalNumber == reverse)
        //     System.out.println(originalNumber+" is a Palindrome Number");
        // else
        //     System.out.println(originalNumber+" is not a Palindrome Number");
        



        // // Question 6: Perfect Number In Java
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check whether it's perfect or not : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1 ; i<=n/2 ; i++) {
        //     if(n % i == 0 ) {
        //         sum += i;
        //     }
        // }
        // if(sum == n) {
        //     System.out.println(n + " is a Perfect Number");
        // }else{
        //     System.out.println(n + " is not a Perfect Number");
        // }




        // // Question 6: Check Leap Year Or Not
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the year to check leap year or not : ");
        // int yr = sc.nextInt();
        // if ((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0)
        //     System.out.println(yr +" is a Leap Year");
        // else
        //     System.out.println(yr +" is not a Leap Year");
    




        // //  Question 7: Kunal is allowed to go out with his friends only on the even days of a given month.
        // //  Write a program to count the number of days he can go out in the month of August
        // Calendar cal = Calendar.getInstance();

        // cal.set(Calendar.MONTH, Calendar.AUGUST);
        // int totalDaysInAugust = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // int numOfEvenDays = (totalDaysInAugust+1)/2;
        // System.out.println("Number of Even Days in August : "+numOfEvenDays);


        

        // // Question 8:Write a program to print the sum of negative numbers,
        // //  sum of positive even numbers and the sum of positive odd numbers
        // //  from a list of numbers (N) entered by the user.
        // //  The list terminates when the user enters a zero.
        // Scanner scanner = new Scanner(System.in);
        // int sumPositiveOddNumbers=0;
        // int sumPositiveEvenNumbers=0;
        // int sumNegativeNumbers=0;
        //     while (true) {
        //         System.out.print("Enter an integer(0 to stop):");
        //         int num = scanner.nextInt();
        //         if (num==0) break;
        //             if (num > 0 && num%2==0) {
        //                 sumPositiveEvenNumbers+=num;
        //             }
        //             else if (num>0 && num%2!=0){
        //                 sumPositiveOddNumbers += num;
        //             }
        //             else{
        //                 sumNegativeNumbers -= num;
        //             }
                
        //     }
        //     System.out.println("\nSum of Positive Odd Numbers: "+sumPositiveOddNumbers);
        //     System.out.println("Sum of Positive Even Numbers: "+sumPositiveEvenNumbers);
        //     System.out.println("Sum of Negative Numbers: -"+sumNegativeNumbers);




    }

}

