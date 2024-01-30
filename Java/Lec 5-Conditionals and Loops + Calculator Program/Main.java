public class Main {
    public static void main(String[] args) {
// //                     If statement

        int sal = 25000;

        if (sal >10000 && sal < 20000) {

            sal +=2000;
            
        }
        else if (sal >20000){
            sal +=5000;
        }
        else{
            sal +=1000;
        }
        System.out.println("Salary actual: " + sal);

    }
}