package Functions.Methods;

public class isprime {
    public static boolean primee(int n){
        boolean primee=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
            primee=false;
            break;
        }
    }
    return primee;
}
    public static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(primee(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String args[]){
        primesinrange(1000);
    }
    
}
