package Strings;

public class equality {
    public static void main(String args[]){
        String s1 = "Sahil";
        String s2 = "Sahil";
        String s3 = new String("Sahil");
        if(s1==s2){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Not Equal");
        }
        if(s1==s3){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Not Equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
    
}
