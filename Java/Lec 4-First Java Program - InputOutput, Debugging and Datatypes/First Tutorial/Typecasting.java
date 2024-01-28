import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int myInt = input.nextInt();
        // float myFloat = input.nextFloat();


        // Type Casting 
        // int myInt = (int)(66.99);
        // System.out.println("Integer Value: " + myInt);


// int a = 258;
// byte b = (byte)(a);
// System.out.println(b);

// byte a = 40;
// byte b = 50;
// byte c = 100;
// int d = a*b/c;

// System.out.println(d);

// Automatic typeconversion


// int num = 'B';
// System.out.println(num);



// System.out.println("안녕하세요");


byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = 0.1234;
double result = (f * b) + (i / c) - (d * s);
// float + int - double = double
System.out.println((f * b) + " " + (i / c) + " " + (d * s));
System.out.println(result);

    }
}
