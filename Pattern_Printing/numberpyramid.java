//       1      
//     2    2
//    3  3  3
//  4  4   4  4
// 5  5  5  5  5 
package Pattern_Printing;

public class numberpyramid {
    public static void main(String args[]){
        int n=9;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            //spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
