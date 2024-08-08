package BasicMaths;
import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Integer To Count Its Digits:  ");
            int n = sc.nextInt();
            int count = 0 ;
            while(n==0){
                count++;
                n=n/10;
            }
            System.out.println("The Integer has : "+count+" digits." );
        }
    }  
}
