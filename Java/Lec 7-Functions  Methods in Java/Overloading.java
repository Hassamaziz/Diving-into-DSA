public class Overloading {
    public static void main(String[] args) {
        fun(44);
        fun("hassam");
       System.out.println( sum(2, 5));
       System.out.println(sum(2,4,5));
    }
    static void fun(int n){
System.out.println(n);
    }
    static void fun(String s){
System.out.println(s);
    }

    static int sum(int a,int b){
return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
            }
}
