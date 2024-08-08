// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

package Functions.Methods;

import java.util.*;
public class Q2 {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number To Check Weather Its Is Even Or Odd ");
            int n = sc.nextInt();
            if(isEven(n)){
                System.out.println("The Number Is A Even Number ");
            }else{
                System.out.println("The Number Is A Odd Number");
            }
        }
    }
    
}
