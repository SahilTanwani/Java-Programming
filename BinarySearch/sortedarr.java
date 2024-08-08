package BinarySearch;
import java.util.*;
public class sortedarr {
    public static void bs(int arr[],int low,int high,int target){
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]==target) break;
            else{
                if(arr[mid]>target){
                    high=mid-1;
                }
                if(arr[mid]<target){
                    low=mid+1;
                }
            }
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
