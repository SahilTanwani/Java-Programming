// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.
package Functions.Methods;

import java.util.*;
public class Q3 {
    public static void  palindrome(int n){
        int initial=n;
        int rev = 0;
        int lastDigit=0;
        while(n!=0){
            lastDigit = n%10;
            rev = rev*10 +lastDigit;
            n/=10;
        }
        if((rev)==(initial)){
            System.out.println("The Number Is A Palindrome");
        }
        else{
            System.out.println("The Number Is Not A Palindrome");
        }

    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            palindrome(n);
        }
    }
}

