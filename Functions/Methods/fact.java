package Functions.Methods;

public class fact {
    public static int facto(int n){
        int fact = n;
        for(int i=1;i<=n-1;i++){
            fact=fact*(n-i);
        }
        return fact;
    }
    public static void main(String args[]){
        int fact = facto(4);
        System.out.println(fact);
        fact = facto(8);
        System.out.println(fact);
    }
    
}
