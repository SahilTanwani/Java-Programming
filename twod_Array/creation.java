package twod_Array;
import java.util.*;
public class creation {
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == key){
                    System.out.println("The Key Is "+key+" And The Coordinates Are "+i+" ,"+j);
                    break;
                }
            }
        }
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
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter Key To Find That Number In The Matrix : ");
        int key = sc.nextInt();
        search(matrix, key);
        }
    }
}
