package Functions.Methods;

import java.util.*;
public class binary_to_decimal {
    public static int binTodec(int n){
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int lastDigit=n%10;
            decimal = decimal+(lastDigit* (int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return decimal;

    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(binTodec(n));
            
        }
    }
    
}
