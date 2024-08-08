package JavaBasics;

import java.util.*;
public class product_a_b {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a Number A: ");
        int a = sc.nextInt();
        System.out.println("Enter a Number B: ");
        int b = sc.nextInt();
        int product = (a*b);
        System.out.print("The Product Of a & b is : ");
        System.out.print(product);
    }
    }
    
}
