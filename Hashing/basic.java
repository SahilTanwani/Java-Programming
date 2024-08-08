package Hashing;
import java.util.*;
public class basic {
    static int count = 0;
    public static void f(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        System.out.println(n+" is repeated "+count+" times");
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int arr[]={1,2,1,3,2};
        System.out.println("Enter a number to find its repeat : ");
        int n = sc.nextInt();
        f(n,arr);
    }
}
}
