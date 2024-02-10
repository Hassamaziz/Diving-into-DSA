import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1,3,4,5,6,7,8,55,55,44,334,3,242234);
        
        multiple(1, 5,"hassam","aziz");
    }

    static void multiple(int a, int b,String ...d){

    }

    static void fun(int ...v){
 
        System.out.print(Arrays.toString(v));
}
}