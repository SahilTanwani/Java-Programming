// This is parameterized method
package Recursion;
import java.util.*;
public class summation1ton {
    static int count = 0;
    public static int f(int i,int n){
        if(i>n){
            return 0;
        }else{
            count+=i;
            f(i+1,n);
            return count; 
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(f(1,n));
        }
    }
}
