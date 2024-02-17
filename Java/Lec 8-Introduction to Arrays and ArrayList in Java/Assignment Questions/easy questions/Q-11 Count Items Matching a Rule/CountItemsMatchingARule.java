public class CountItemsMatchingARule {
    public static void main(String[] args) {
        // Count Items Matching a Rule
        // You are given an array items, where each items[i] = [typei, colori, namei] describes 
        // the type, color, and name of the ith item. You are also given a
        //  rule represented by two strings, ruleKey and ruleValue.

        // The ith item is said to match the rule if one of the following is true:

        // ruleKey == "type" and ruleValue == typei.
        // ruleKey == "color" and ruleValue == colori.
        // ruleKey == "name" and ruleValue == namei.
        // Return the number of items that match the given rule.
        String[][] items = {{"phone","blue","pixel"},
         {"computer","silver","lenovo"},
          {"phone","gold","iphone"} };
          String ruleKey = "type";
          String ruleValue = "phone";
          
          int count = countItemsMatchingRule(items,ruleKey,ruleValue);
          System.out.println("Number of items matching the rule : "+count);
    }
    static int countItemsMatchingRule(String[][] items, String ruleKey, String ruleValue){
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if ((ruleKey=="type" && ruleValue.equals(items[i][0])) ||  
                (ruleKey=="color" && ruleValue.equals(items[i][1]))||
                 ruleKey=="name" && ruleValue.equals(items[i][2]) ) 
               count++;
            
        }
        return count;
    }
}
