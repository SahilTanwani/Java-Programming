package BitManipulation;
import java.util.*;

public class ith_bit {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            System.out.println("Enter ith position To Find The Bit Is 0 or 1");
            int i=sc.nextInt();
            int bitmask = (1<<i);
            if((n & bitmask)==0){
                System.out.println("The Bit At "+i+" Position Is 0");
            }else{
                System.out.println("The Bit At "+i+" Position Is 1");
            }
        }
    }
    
}
