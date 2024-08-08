package Functions.Methods;

public class binomial {
    public static int bino(int n,int r){
        int fact = n;
        for(int i=1;i<=n-1;i++){
            fact=fact*(n-i);
        }
        System.out.println(fact);
        int ract = r;
        for(int j=1;j<=r-1;j++){
            ract=ract*(r-j);
        }
        System.out.println(ract);
        int bact = n-r;
        for(int k=1;k<=(n-r)-1;k++){
            bact=bact*((n-r)-k);
        }
        System.out.println(bact);
        int binomial=fact/(ract*bact);
        return binomial;
    }
    public static void main(String args[]){
        int binomial = bino(5, 2);
        System.out.println("The Binomial coefficient Is "+binomial);

    }
    
}
