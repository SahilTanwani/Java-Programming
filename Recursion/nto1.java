//print from n to 1
package Recursion;
import java.util.*;

public class nto1 {
    public static void f(int n,int i){
        if(n==0){
            return;
        }else{
            System.out.println(n);
            f(n-1,i);
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        f(n,1);
        }
    }
}
