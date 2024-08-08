package BitManipulation;
import java.util.*;
public class Q3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a Number To Get A Number Added By 1 : ");
            int n = sc.nextInt();
            System.out.println(-(~n));
        }   
    }
    
}
