package Strings;

import java.util.*;
public class basics {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "abcdefghijklmnopqrstuvwxyz";
            System.out.println(str);
            // Strings are IMMUTABLE
            String name=sc.nextLine();
            System.out.println(name);
            System.out.println(name.length());
            //Strings mein length ek function hota hai arrays mein property isliye hum yaha likh rahe hai with parenthesis
        }
    }
    
}
