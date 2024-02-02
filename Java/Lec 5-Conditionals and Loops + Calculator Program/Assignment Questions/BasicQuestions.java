import java.util.Scanner;

public class BasicQuestions{
    public static void main(String[] args) {
        // Question 1: Area Of Circle Java Program

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double r = input.nextDouble();
        double area = Math.PI * (r*r);
        System.out.println("The area of the circle is : "+ area);

    }
}