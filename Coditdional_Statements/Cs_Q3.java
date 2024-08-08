package Coditdional_Statements;

import java.util.*;
public class Cs_Q3 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            switch(n){
                case 1 : System.out.print("Monday");
                        break;
                case 2 : System.out.print("Tuesday");
                        break;
                case 3 : System.out.print("Wednesday");
                        break;
                case 4 : System.out.print("Thursday");
                        break;
                case 5 : System.out.print("Fridyy");
                        break;
                case 6 : System.out.print("Saturday");
                        break;
                case 7 : System.out.print("Sunday");
                        break;
                default: System.out.print("Enter A Number Between 1 to 7");
            }
        }
    }
}
