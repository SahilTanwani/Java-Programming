package Sorting;
import java.util.*;
public class quicksort {
    public static int f(int arr[],int low,int high){
        int pivot = arr[low];
        int left = low;
        int right = high;
        while(left<=right){
            while(arr[left]<=arr[pivot] && left<=low+1){
                left++;
            }
            while(arr[right]>arr[pivot] && right>=high-1){
                right--;
            }
            if(left<right){
                //swap
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        // swap
        int tempe = arr[low];
        arr[low]=arr[right];
        arr[right]=tempe;
        return right;
    }
    public static void qs(int arr[],int low,int high){
        if(low<high){
            int partitionIndex = f(arr,low,high);
            qs(arr, low, (partitionIndex-1));
            qs(arr, (partitionIndex+1), high);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter an Array for Sorting : ");
            System.out.println("Enter The Size Of The Array : ");
            int n = sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter The Elements of the Array : ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            qs(arr,0,n-1);
            System.out.println("The Sorted Array Is : ");
            for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
}
}
