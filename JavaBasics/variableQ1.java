// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

package JavaBasics;
import java.util.*;
public class variableQ1 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number x : ");
            int x = sc.nextInt();
            System.out.print("Enter a number y : ");
            int y = sc.nextInt();
            System.out.print("Enter a number z : ");
            int z = sc.nextInt();
            int avg = (x+y+z)/3;
            System.out.print("The Average Of These 3 Numbers Is : ");
            System.out.print(avg);
        }
    }
    
}
