package BitManipulation;
import java.util.*;
public class clear_range_bits {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            System.out.println("Enter ith Starting Position : ");
            int i = sc.nextInt();
            System.out.println("Enter jth Ending Position : ");
            int j = sc.nextInt();
            int a = ((~0)<<(j+1));
            int b = (1<<i)-1;
            int bitMask = (a|b);
            n = (n & bitMask);
            System.out.println("Updated n is "+n);
        }
    }
    
}
