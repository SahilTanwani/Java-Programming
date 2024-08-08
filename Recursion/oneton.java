package Recursion;
import java.util.*; 
public class oneton {
    public static void f(int n){
        if(n>0){
        f(n-1);
        System.out.print(n+" ");
    }
}
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter A Number N : ");
        int n = sc.nextInt();
        f(n);
       } 
    }
}
