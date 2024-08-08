//     *    
//    * *   
//   * * *  
//  * * * * 
// * * * * *
/*
    1
   123
  12345
 1234567
123456789
*/ 

package Pattern_Printing;

public class star {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            // spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
