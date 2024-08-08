package Pattern_Printing;

public class butterflypattern {
    public static void main(String args[]){
        // 1st Half
        int n = 4;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
