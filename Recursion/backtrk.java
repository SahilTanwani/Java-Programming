package Recursion;
import java.util.*;
public class backtrk {
    public static void f(int i,int n){
        if(i==0){
            return;
        }else{
            f(i-1,n);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            f(n,n);
        }
    }
    
}
