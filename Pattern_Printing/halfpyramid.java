package Pattern_Printing;

import java.util.*;
public class halfpyramid {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int m = sc.nextInt();
            for(int i=1;i<=m;i++){
                for(int j=1;j<=i;j++){
                System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    
}
