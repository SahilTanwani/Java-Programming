package Sorting;
import java.util.*;
public class bubbleesort {
    public static void Bubble(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        Bubble(arr,n);
    }
}
}
