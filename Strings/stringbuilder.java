package Strings;

public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("SahilTanwani");
        sb.toString();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
    
}
