package Arrays;
import java.util.*;

public class prefix_sum_array{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int sum = Integer.MIN_VALUE;
        int curr_sum;
        System.out.println("Enter The Size Of An Array :  ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements Of An Array : ");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }
        System.out.println("\nThe Prefix Sum Of The Above Array Is Follows :- ");
        int a = arr.length;
        int prefix[]=new int[a];
        prefix[0]=arr[0];
        for(int k=1;k<a;k++){
            prefix[k]=prefix[k-1]+arr[k];
        }
        System.out.println("The Prefix Sum Array Is ");
        for(int l=0;l<a;l++){
            System.out.print(prefix[l]+" ");
        }
        for(int c=0;c<arr.length;c++){
            int start = c;
            for(int b=c;b<arr.length;b++){
                int end = b;
                if(start==0){
                    curr_sum = prefix[end];
                }else{
                    curr_sum = prefix[end]-prefix[start-1];
                }
                if(curr_sum>sum){
                    sum=curr_sum;
                }
                for(int d=start;d<=end;d++){
                    System.out.print(arr[d]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Subarray Sum Is : "+sum);
    }
    }
}