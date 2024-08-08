package twod_Array;
import java.util.*;
public class diagonalsum {
    public static void diagsum(int matrix[][]){
        // TIMECOMPLEXITY IS O(n^2)
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j || i+j==matrix.length-1){
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);
        // TIMECOMPLEXITY IS O(n)
        for(int i=0;i<matrix.length;i++){
            sum = sum+matrix[i][i];
            sum = sum+matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter The Order of The matrix : m*n ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter The Elements Of The Matrix : ");
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        diagsum(matrix);
    }
}    
}
