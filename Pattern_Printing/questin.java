// 12344321
// 123  321
// 12    21
// 1      1



package Pattern_Printing;
import java.util.*;
public class questin {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter A Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n*2;j++){
                // spaces
                // numbers
                if(j<=n){
                    System.out.print(j);
                }else{
                    System.out.print(j-a);
                    a+=2;
                }
            }
            System.out.println();
        }
        }
    }
    
}
