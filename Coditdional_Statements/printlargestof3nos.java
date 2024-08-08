package Coditdional_Statements;

import java.util.*;
public class printlargestof3nos {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number A : ");
            int a = sc.nextInt();
            System.out.print("Enter a number B : ");
            int b = sc.nextInt();
            System.out.print("Enter a number C : ");
            int c = sc.nextInt();
            if(a>b){
                if(a>=c){
                    System.out.print("A is largest "+(a));
                }
                else{
                    System.out.print("C is largest "+(c));
                }
            }
            else if(b>=c){
                System.out.print("B is largest "+(b));
            }
                else{
                System.out.print("C is largest "+(c));
            }
        }
    }    
}
