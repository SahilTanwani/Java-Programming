package Hashing;
import java.util.Scanner;
public class properhashing {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,4,5,6,7,8,9,2,3,3,2,2,3,5,7,8,8,0,0,12};
        int hash[] = new int[13];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter A number To Check : ");
        int n = sc.nextInt();
        System.out.println(n+" Is repeated "+hash[n]+" times");
    }
}
}
