package Loops;

import java.util.*;
public class Q4 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int table = 1;
            for(int i=1;i<=10;i++){
                table = n*i;
                System.out.println((n)+"*"+(i)+"="+(table));
            }
        }
    }
    
}
