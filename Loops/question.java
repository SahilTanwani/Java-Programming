//keep entering numbers till user enters multiple of 10 break statement question

package Loops;

import java.util.*;
public class question {
    public static void main(String args){
        try (Scanner sc = new Scanner(System.in)){
            for (int i = 1;i<=100;i++){
                System.out.println("Enter a number to check it is a multiple of 10 or not");
                int n = sc.nextInt();
                if(n%10==0){
                    System.out.println((n)+ " Is A Multiple Of 10");
                    break;
                }
                else{
                    System.out.println((n)+" Is Not A Multiple Of 10 Try Again");
                }
            }
        }
    }
    
}
