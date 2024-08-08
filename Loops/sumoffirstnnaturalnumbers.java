package Loops;

import java.util.*;
public class sumoffirstnnaturalnumbers {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int sum = 0;
            System.out.println("Enter a number n till you want sum of natural numbers");
            int n = sc.nextInt();
            int i = 1;
            while(i<=n){
                sum = sum + i;
                i++;
            }
            System.out.println("The Sum Of First "+(n)+"Natural numbers Is "+(sum) );
        }
    }
    
}
