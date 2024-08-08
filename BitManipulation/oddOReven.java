package BitManipulation;
import java.util.*;

public class oddOReven {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int bitmask = 1;
            if((n & bitmask)==0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
    
}
