package Hashing;
import java.util.*;
public class characterhash {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
    char arr[]={'a','b','c','d','e','f','f','r','e','s','d','a','b','c','f','r'};
    int hash [] = new int[26];
    for(int i=0;i<hash.length;i++){
        hash[i]=0;
    }
    for(int i=0;i<hash.length;i++){
        hash[arr[i]-'a']+=1;
    }
    System.out.println("Enter A Letter To Find How Many Times It Is Repeated : ");
    String ch = sc.nextLine();
    char c = ch.charAt(0);
    System.out.println(c+" Is Repeated "+(hash[c-'a'])+" Times");
   } 
}
}