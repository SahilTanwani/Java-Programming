package Loops;

import java.util.*;
public class reverse {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enterr a Number To Reverse it");
            int n = sc.nextInt();
            int reverse = 0;
                while(n>0){
                reverse = reverse + n%10;
                reverse = reverse*10;
                n=n/10;
            }
            System.out.println(reverse/10);
        }
    }
    
}
