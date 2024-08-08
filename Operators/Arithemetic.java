package Operators;

public class Arithemetic {
    public static void main(String args[]){
        int a = 10;
        int b = 8;
        System.out.println("Addition = "+ (a+b));
        System.out.println("Subtraction = "+ (a-b));
        System.out.println("Multiplication = "+ (a*b));
        System.out.println("Division = "+ (a/b));
        System.out.println("Modulus = "+ (a%b));
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        int e = 10;
        int f = e++;
        System.out.println(e);
        System.out.println(f);
    }
    
}
