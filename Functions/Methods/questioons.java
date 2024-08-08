// Write a Java method to compute the average of three numbers

package Functions.Methods;

import java.util.*;
public class questioons {
    public static int avg(int a,int b,int c){
        int avgof3= (a+b+c)/3;
        return avgof3;
    }
    public static void main(String args[]){
        System.out.println("Enter 3 numbers to take avg of them");
      try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      System.out.println("The avg of these three numbers is "+(avg(a,b,c)));
      }
    }
    
}
