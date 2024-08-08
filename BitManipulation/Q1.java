// What is the value of x^x for any value of x?
package BitManipulation;
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a Number : ");
            int n = sc.nextInt();
            System.out.println(n^n);
        }
    }
    
}
