package Recursion;
import java.util.*;
public class fibonacci {
    public static int f(int n){
        if(n<=1){
            return n;
        }else{
            return (f(n-1)+f(n-2));
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter nth number to find fibonacci number : ");
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
}
