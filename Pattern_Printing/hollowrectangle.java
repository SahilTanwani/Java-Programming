package Pattern_Printing;

import java.util.*;
public class hollowrectangle {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int m = 5;
            int n = 6;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if((i==1 || i==m) || (j==1 || j==n)){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
}
