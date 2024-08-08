package BitManipulation;
import java.util.*;
public class clearlast_ibits {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            System.out.println("Enter ith Position : ");
            int i = sc.nextInt();
            int bitMask = ((~0)<<i);
            n = (n & bitMask);
            System.out.println("Updated n is "+n);
        }
    }
    
}
