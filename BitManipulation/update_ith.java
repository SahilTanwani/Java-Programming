package BitManipulation;
import java.util.*;
public class update_ith {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            System.out.println("Enter ith Position : ");
            int i = sc.nextInt();
            System.out.println("Enter New Bit : ");
            int newBit = sc.nextInt();
            // first clearing the ith bit 
            //bitmask 1 for clearing the bit
            int bitMask1 = (~(1<<i));
            n = (n & bitMask1);
            //Now Updating ith bit according to the condition
            // bitmask 2 for updating 
            int bitMask2 = (newBit<<i);
            n = (n | bitMask2);
            System.out.println("Updated n is "+n);
        }
    }
    
}
