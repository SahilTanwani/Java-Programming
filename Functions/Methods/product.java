// Product of A & B wher a=3 b=5
package Functions.Methods;

public class product {
    public static int multiply(int a,int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String args[]){
        multiply(3,5);
        int prod = multiply(3,5);
        System.out.println("Product Is = "+prod);
    }
    
}
