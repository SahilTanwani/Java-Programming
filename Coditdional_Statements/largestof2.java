package Coditdional_Statements;

import java.util.*;
public class largestof2 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number A : ");
            int a = sc.nextInt();
            System.out.print("Enter a number B : ");
            int b = sc.nextInt();
            if(a>b){
                System.out.print("A is greater it is " + (a));
            }
            else{
                System.out.print("B is greater it is " + (b));
            }
        }
    }
    
}
