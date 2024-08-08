package Coditdional_Statements;

import java.util.*;
public class evenodd {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to check weather it is even or odd");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.print("The Input Number " + (n) + " Is Even");
            }
            else{
                System.out.print("The Input Number " + (n) + " Is Odd");
            }

        }
    }
    
}
