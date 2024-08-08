package Recursion;
import java.util.*;
public class sumation1ton {
    public static int f(int n){
        if(n==0){
            return 0;
        }else{
            return n+f(n-1);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    
}
