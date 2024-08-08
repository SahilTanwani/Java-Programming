package BinarySearch;
import java.util.*;

public class sortedarray {
    public static void bs(int arr[],int low,int high,int target){
        if(low>high){
            System.out.println("The No does not exist : ");
        }
        int mid = (low + high)/2;
        if(arr[mid] == target){
            System.out.println(target+" is at the index "+mid);
        }else{
            if(arr[mid]>target){
                high = mid-1;
            }
            if(arr[mid]<target){
                low = mid+1;
            }
            bs(arr, low, high, target);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter The Size of the Array : ");
        int n = sc.nextInt();
        System.out.println("Enter The Elements Of The Array : ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target to Find : ");
        int target = sc.nextInt();
        bs(arr,0,(n-1),target);
    }
}
}
