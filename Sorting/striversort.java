package Sorting;
import java.util.*;
public class striversort {
    public static void Selection(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[i]){
                    min = j;
                }
                // swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("The Sorted Array Is : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Selection(arr,n);
    }
}
}