// Write a program to find the factorial of any number entered by the user.
package Loops;

import java.util.*;
public class Q3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number To Find Its Factorial");
            int n = sc.nextInt();
            int fact = n;
            for(int i=1;i<=n-1;i++){
                fact = fact*(n-i);
            }
            System.out.println(fact);
        }
    }
    
}
