package Recursion;

public class basic {
    // static void fn(){
    //     System.out.println("1");
    //     fn();
    // }
    // public static void main(String[] args) {
    //     fn();
    // }
    

    // with base condition
    static int count = 0;
    public static void f(){
        if(count==3){
            return;
        }else{
            System.out.println(count);
            count++;
        }
        f();
    }
    public static void main(String[] args) {
        f();
    }
}
