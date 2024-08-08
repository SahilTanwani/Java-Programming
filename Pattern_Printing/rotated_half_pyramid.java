package Pattern_Printing;

import java.util.*;
public class rotated_half_pyramid {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int m = 8;
            int n = 8;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(j<=n-i){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }

                }
                System.out.println();
            }
        }
    }
}
