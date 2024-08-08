package Pattern_Printing;

public class zero_one_triangle {
    public static void main(String args[]){
        int m =20;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
    
}
