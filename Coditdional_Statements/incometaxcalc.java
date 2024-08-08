package Coditdional_Statements;

import java.util.*;
public class incometaxcalc {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Income In LPA : ");
            float income = sc.nextFloat();
            float tax = 0f;
            if(income<5){
                System.out.print("You Will Have To Pay 0% Tax");
            }
            else if(income>5 && income<=10){
                tax = tax + (income*20)/100;
                System.out.print("You Will Have To Pay 20% Tax = "+(tax));
            }
            else{
                tax = tax + (income*30)/100;
                System.out.print("You Will Have To Pay 20% Tax = "+(tax));
            }

        }
    }
    
}
