// Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.

package Loops;

import java.util.*;
public class Q2 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int sumeven = 0;
            int sumodd = 0;
            for(int i=1;i<=10;i++){
                System.out.println("Enter "+(i)+"st number");
                int n =sc.nextInt();
                if(n%2==0){
                    sumeven += n;
                }else{
                    sumodd += n;
                }
            }
            System.out.println("The Sum Of Even Inputs is "+sumeven);
            System.out.println("The Sum Of odd Inputs is "+sumodd);
        }
    }
    
}
