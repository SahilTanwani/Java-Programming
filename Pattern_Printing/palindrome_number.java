//     1
//    212
//   32123
//  4321234
// 543212345

package Pattern_Printing;

public class palindrome_number {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
