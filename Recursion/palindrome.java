package Recursion;

public class palindrome {
    public static boolean f(String s,int i,int n){
        if(i>=n/2){
            return true;
        }
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }else{
                return f(s,i+1,n);
            }
        }
    public static void main(String[] args) {
        String s = "MADSM";
        int n=s.length();
        System.out.println(f(s,0,n));
    }
}
