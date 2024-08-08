package Loops;

import java.util.*;
public class continuestatement {
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
       }
    }
    
}
