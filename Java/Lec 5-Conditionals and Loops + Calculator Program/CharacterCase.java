import java.util.Scanner;

public class CharacterCase {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // if (Character.isLowerCase(ch))
        if(ch >='a' && ch<='z')
        { System.out.println("The String is lowercase"); }

        else
        { System.out.println("The String is uppercase");
    }

    }
}
