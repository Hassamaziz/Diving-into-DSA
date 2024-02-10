public class Overloading {
    public static void main(String[] args) {
        fun(44);
        fun("hassam");
    }
    static void fun(int n){
System.out.println(n);
    }
    static void fun(String s){
System.out.println(s);
    }
}
