package Recursion;
import java.util.*;
public class backtrknto1 {
    public static void f(int i,int n){
    if(i==n){
        return;
    }else{
        f(i+1,n);
        System.out.println(i);
    }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            f(1,n);
        } 
    }
    
}
