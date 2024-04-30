import java.util.Arrays;

public class ValidAnagram{
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarrm";
        System.out.println("is the given string an anagram "+isValidAnagram(s,t));

    }
    //Function to check if two strings are valid Anagrams or not 
    static boolean isValidAnagram(String s, String t){
        //Checking if both strings have equal length or not
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        //If sorted characters of both strings are same then they are anagrams otherwise not
        return Arrays.equals(sChars, tChars);
        
      
    
    }  

}