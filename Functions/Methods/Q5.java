package Functions.Methods;

import java.util.*;
public class Q5 {
    public static void sumofinteger(int n){
        int sum = 0;
        int lastDigit;
        while(n!=0){
            lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number To Find the sum of its digits");
            int n = sc.nextInt();
            sumofinteger(n);
        }
    }
    
}
