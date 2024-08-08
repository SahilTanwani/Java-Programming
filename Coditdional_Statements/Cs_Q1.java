// Write a Java program to get a number from the user and print whether it is
// positive or negative.



package Coditdional_Statements;

import java.util.*;

public class Cs_Q1 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to check weather it is positive or negative");
            int n = sc.nextInt();
            if(n==0){
                System.out.println("The Number Is neither Positive Nor Negative");
            }
            else if(n>0){
                System.out.println("The Number Is Positive ");
            }
            else{
                System.out.println("The Number Is Negative");
            }
        }
    }
    
}
