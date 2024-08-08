package BitManipulation;
import java.util.*;
public class check_powerOF2orNot {
    public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter A Number n To Check Weather It Is Power Of 2 Or Not");
        int n = sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
}
