package Arrays;
import java.util.*;
public class largestno {
    public static int large(int numbers[]){
        int largeno = Integer.MIN_VALUE;
        int smallno = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largeno){
                largeno=numbers[i];
            }
            if(numbers[i]<smallno){
                smallno=numbers[i];
            }
        }
        System.out.println("The Smallest Number Is "+smallno);
        return largeno;
    } 
    public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        int numbers[]={1,2,6,7,9,11,3,5,8};
        int largestnumber = large(numbers);
        System.out.println("The Largest Number Is "+largestnumber);
    }
    }
    
}
