package BitManipulation;
import java.util.*;
public class count_set_bits {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number : ");
            int n = sc.nextInt();
            int bitMask = (1<<0);
            int count = 0;
            while(n>0){
                if((n & bitMask)!=0){
                    count++;
                }
                n=n>>1;
            }
            System.out.println("Count = "+count);
        }
    }
    
}
