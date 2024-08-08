package Arrays;

import java.util.*;
public class linearSearch {
    public static int searchNumber(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = sc.nextInt();
        int index = searchNumber(numbers,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key Is At Index : "+index);
        }
    }
    }
    
}
