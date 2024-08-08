// In a program, input the side of a square. You have to output the area of the
// square

package JavaBasics;
import java.util.*;

public class variableQ2 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the length of Side of a Square : ");
            int a = sc.nextInt();
            int area = a*a;
            System.out.print("The Area Of the Square Is : ");
            System.out.print(area);
        }
    }
    
}
