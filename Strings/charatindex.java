package Strings;

public class charatindex {
    public static void printletters(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
    }
    public static void main(String args[]){
        String fullName = "Sahil Tanwani";
        System.out.println(fullName.charAt(1));
        printletters(fullName);
    }
    
}
