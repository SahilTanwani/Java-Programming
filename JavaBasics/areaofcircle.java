package JavaBasics;
import java.util.*;
public class areaofcircle {
    public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter Radius Of Circle To Find Its Area : ");
        float r = sc.nextFloat();
        float area = (3.14f*r*r);
        System.out.print("The Area Of The Circle Is : ");
        System.out.print(area);
    }
    }
}
