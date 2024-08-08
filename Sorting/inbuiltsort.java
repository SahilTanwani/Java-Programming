package Sorting;

// import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String args[]){
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.println("Enter The Size Of an Array : ");
        //     int n = sc.nextInt();
        //     int numbers[] = new int[n];
        //     System.out.println("Enter The Elements Of Your Array : ");
        //     for(int i=0;i<n;i++){
        //         numbers[i]=sc.nextInt();
        //     }
        //     System.out.println("The Normal Entered Array Is: ");
        //     for(int i=0;i<n;i++){
        //         System.out.print(numbers[i]);
        //     }
            Integer numbers[] = {5,2,7,8,4,1,3,6};
            Arrays.sort(numbers,0,5, Collections.reverseOrder());
            System.out.println("\n The Sorted Array Is : \n");
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]);
            }
        }
    
    }
