package Coditdional_Statements;

import java.util.*;
public class ifelse {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Sahil's age : ");
            int age = sc.nextInt();
            if(age>=18){
                System.out.print("Sahil is a adult, he can vote");
            }
            else{
                System.out.print("Sahil is not adult");
            }
        }
    }
    
}
