package Functions.Methods;

import java.util.*;
public class decimal_to_binary {
    public static int decTobin(int n){
        int binary=0;
        int place=1;
        while(n>0){
            int remainder = n%2;
            n/=2;
            binary = binary + (remainder*place);
            place=place*10;

        }
        return binary;

    }
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        System.out.println(decTobin(n));
       }

    }
    
}
