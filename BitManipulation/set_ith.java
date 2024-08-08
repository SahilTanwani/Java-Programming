package BitManipulation;
import java.util.*;
public class set_ith {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            System.out.println("Enter ith position To Find The Bit Is 0 or 1");
            int i=sc.nextInt();
            int bitmask = (1<<i);
            int a = (n | bitmask);
            System.out.println(a);
        }
    }
}
