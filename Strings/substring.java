package Strings;

public class substring {
    public static void substr(String str,int si,int ei){
        String substr ="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String args[]){
        //substring 
        String str = "HelloWorld";
        substr(str,0,5);
        //Another Method Java has a inbuilt substring function
        System.out.println(str.substring(0,10));
    }
    
}
