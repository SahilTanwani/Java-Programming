package Coditdional_Statements;

import java.util.*;
public class q {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Total marks of the paper");
            float tm = sc.nextFloat();
            System.out.print("Enter a number a : ");
            float a = sc.nextInt();
            System.out.print("Enter a number b : ");
            float b = sc.nextInt();
            System.out.print("Enter a number c : ");
            float c = sc.nextInt();
            float total = (a+b+c)/3;
            if(a>=0.33*tm && b>=0.33*tm && c>=0.33*tm && total>=0.4*tm){
                System.out.println("You Are Passed");
            }
            else{
                System.out.println("You Failed");
            }
            System.out.print("Your Total is : ");
            System.out.println(total);
        }
    }
    
}
