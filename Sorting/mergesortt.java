package Sorting;
import java.util.*;
public class mergesortt {
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void mergesort(int arr[],int low,int high){
        if(low==high){
            return ;
        }
        int mid = (low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
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
            mergesort(arr,0,n-1);
            System.out.println("The Sorted Array is : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
