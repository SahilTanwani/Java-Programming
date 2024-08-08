// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


package JavaBasics;
import java.util.*;
public class variableQ3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Cost Of A Pencil : ");
            float pencil = sc.nextFloat();
            System.out.print("Enter The Cost Of A Pen : ");
            float pen = sc.nextFloat();
            System.out.print("Enter The Cost Of A Eraser : ");
            float eraser = sc.nextFloat();
            float bill = (pencil+pen+eraser);
            System.out.print("The Total Bill Is : ");
            System.out.print(bill);
            float gst = (bill*18)/100;
            float totalbill = bill+gst;
            System.out.print("The Total Bill With Gst Is : ");
            System.out.print(totalbill);
        }
    }
    
}
