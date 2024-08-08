package Loops;

import java.util.*;
public class primeornot {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    System.out.println("The Number N Is A Composite Number ");
                    break;
                }
                }
                    System.out.println("The Number N Is A Prime Number ");
        }
    }
    
}
