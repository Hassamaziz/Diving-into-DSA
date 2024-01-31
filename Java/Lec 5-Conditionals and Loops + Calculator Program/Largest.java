import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //  Traditional And lengthy way to find large number
    //     int max =  a;
    //     if (max < b) {
    //         max = b;
    //     }
    //     if(max < c ){
    //         max= c;
    //     }
    //     System.out.println("The largest number is " + max);


// A shorter way to calculate largest number

    int max = Math.max(c,(Math.max(a,b)));

    System.out.println("Maximum number is " + max);


    }

    
}
