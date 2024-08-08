package twod_Array;
import java.util.*;
public class spiralmatrix {
    public static void spiralll_(int[][] matrix){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //bottom
            for(int k=endCol-1;k>=startCol;k--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][k]+" ");
            }
            //left
            for(int l=endRow-1;l>=startRow+1;l--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[l][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
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
        spiralll_(matrix);
    }
}    
}

