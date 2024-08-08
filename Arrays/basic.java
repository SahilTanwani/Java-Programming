package Arrays;

import java.util.*;
public class basic {
    public static void main(String args[]){
    int marks[] = new int[50];
    // int numbers[] = {1,2,3};
    // int nos[] = {4,5,6};
    // String fruits[] = {"apple","mango","orange"};
    //input in arrays
    try(Scanner sc = new Scanner (System.in)){
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("phy = "+marks[0]);
    System.out.println("chem = "+marks[1]);
    System.out.println("maths = "+marks[2]);
    int percentage = (marks[0]+marks[1]+marks[2])/3;
    System.out.println(percentage);
    }
    }
}
