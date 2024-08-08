package BitManipulation;
import java.util.*;
public class fast_exponenciation {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number A : ");
            int a = sc.nextInt();
            System.out.println("Enter Power Of A : ");
            int p =sc.nextInt();
            int ans = 1;
            while(p>0){
                if((p&1)!=0){
                    ans = ans*a*1;
                    a=a*a;
                    p=(p>>1);
                }else{
                    ans = ans*1;
                    a=a*a;
                    p=(p>>1);
                }
            }
            System.out.println("The Answer Is "+ans);
        }
    }
    
}
