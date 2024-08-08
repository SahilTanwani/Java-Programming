package JavaBasics;

import java.util.*;
public class sum_a_b_input {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a Number A: ");
        int a = sc.nextInt();
        System.out.println("Enter a Number B: ");
        int b = sc.nextInt();
        int sum = (a+b);
        System.out.print("The Sum Of a & b is : ");
        System.out.print(sum);
    }
    }
    
}
