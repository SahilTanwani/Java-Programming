package Operators;
import java.util.*;
public class Question {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number a : ");
            float a = sc.nextInt();
            System.out.print("Enter a number b : ");
            float b = sc.nextInt();
            System.out.print("Enter a number c : ");
            float c = sc.nextInt();
            float roots = ((b*b)-(4*a*c))/2*a;
            System.out.print("The Roots are : ");
            System.out.println(roots);
        }
    }
    
}
