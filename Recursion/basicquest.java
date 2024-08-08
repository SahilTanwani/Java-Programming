// print name 5 times using recursion

package Recursion;
import java.util.Scanner;
public class basicquest {
    public static void name(int i,int n){
        if(i>n){
            return;
        }else{
            System.out.println(i+" Sahil");
            name(i+1,n);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        name(1,n);
    }
}
}
