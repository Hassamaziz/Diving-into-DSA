import java.util.Arrays;

public class PangramOrNot {
    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        boolean isPangram = checkIfPangram(input);
        System.out.println(isPangram);
    }    
    static boolean checkIfPangram(String input) {
        char ch = 'a';
        int n = 26; 
        for (int i = 0; i < n; i++) {
            if (input.contains(String.valueOf(ch))) {
                ch++;
                
            }
            else{
               return false;    
            }
            
        }
        
        return true;  


       
    }
}
