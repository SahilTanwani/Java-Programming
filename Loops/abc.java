package Loops;

import java.util.Scanner;

public class abc {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a Number n to check weather it is true or not");
            int n = sc.nextInt();
            int a = 0;
            if (n==2){
                System.out.println("The number 2 is a prime number");
            }
            else{
                for(int i=2;i<=n-1;i++){
                    if(n%i==0){
                        a=1;
                    }
                }
                if(a==0){
                    System.out.println("The Number Is A Prime Number");
                }
                else{
                    System.out.println("The Number Is Not A Prime Number");
                }
            }
        }
        }
    }
