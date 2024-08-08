package Strings;

import java.util.*;
public class palindromeornot {
    public static void palindrome(String palin){
        int n = palin.length();
        int c=0;
        for(int i=0;i<(n/2);i++){
            int a = palin.charAt(i);
            int b = palin.charAt(n-i-1);
            if(a!=b){
                c=1;
            }
        }
        if(c==0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not A Palidrome");
        }

        }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String palin;
            System.out.println("Enter The String To Check Weather It Is A Palindrome Or Not");
            palin = sc.nextLine();
            System.out.println("Entered String Is "+palin);
            palindrome(palin);

        }
    }
    
}
