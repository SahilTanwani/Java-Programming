package Arrays;
import java.util.*;
public class binarysearch {
    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;   
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter A Number To Find Its Index");
        int n = sc.nextInt();
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key = n;
        int returnstatement = binary(numbers, key);
        if(returnstatement==-1){
            System.out.println("The Number Does Not Exist");
        }
        else{
            System.out.println("The Index Of The Input Number Is "+returnstatement);
        }
    }
    }
    
}
