import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a fruit name: ");

                                          // NORMAL SWITCH STATEMENT 
        // String fruit = input.nextLine(); 
        // switch (fruit) {
        //     case "mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "apple":
        //     System.out.println("Sweet red fruit.");
        //     break;
        //     case "orange":
        //         System.out.println("Citrus fruit with a round orange color.");
        //         break;
        //         case "grape":
        //         System.out.println("Small fruit with a purple skin and sweet taste.");
        //         break;
        
        //     default:
        //         System.out.println("Please enter a valid fruit name!");  
        // }

        System.out.println("Enter a Day");
        int day = input.nextInt();

                              // ENHANCED SWITCH STATEMENT
        // switch (day) {
        //     case 1 ->System.out.println("Monday");
        //     case 2 ->System.out.println("Tuesday");
        //     case 3 ->System.out.println("Wednesday");
        //     case 4 ->System.out.println("Thursday");
        //     case 5 ->System.out.println("Friday");
        //     case 6 ->System.out.println("Saturday");
        //     case 7 ->System.out.println("Sunday");
        //     default -> System.out.println("enter a valid day number");
    // }

        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     System.out.println("Its a Weekday");
                
        //         break;
        //     case 6:
        //     case 7:
        //     System.out.println("Its a Weekend");  
        //     break;  
        
        //     default:
        //     System.out.println("Enter valid day");
                
        // }


        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Its a weekday");
            case 6,7 -> System.out.println("Its a Weekend");
            default -> System.out.println("enter valid day"); 
        
          
        }
                
              
        
    }
}