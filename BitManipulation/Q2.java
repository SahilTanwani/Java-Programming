// Swap two numbers without using any third variable. *****
package BitManipulation;
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Before Swapping
            System.out.println("Before Swapping  a = "+a+" b = "+b);
            a = a^b;
            b = a^b;
            a = a^b;
            System.out.println("After Swapping  a = "+a+" b = "+b);
        }
    }
    
}
