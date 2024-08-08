// keep entering numbers till user enters multiple of 10 break statement question

package Loops;

import java.util.*;
public class xyz{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            do{
                int n = sc.nextInt();
                if (n%10==0){
                    break;
                }
                System.out.println(n);
            }while(true);
        }
    }
}