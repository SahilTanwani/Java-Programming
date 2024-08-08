// integer or not by using boolean has Next Int


package JavaBasics;

import java.util.*;
public class integerornot {
    public static void main(String args[]){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Enter A Integer : ");
            boolean n = sc.hasNextInt();
            System.out.println(n);

        }
    }
    
}
