package Loops;

import java.util.*;
public class one_to_n {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number N till you want to print numbers");
            int n =sc.nextInt();
            int i = 1;
            while(i<=n){
                System.out.println(i);
                i++;
            }
        }
    }
    
}
