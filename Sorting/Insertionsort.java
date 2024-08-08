package Sorting;

import java.util.*;
public class Insertionsort {
    public static void sort(int numbers[]){
        for(int i=0;i<=numbers.length-1;i++){
            int prev = i;
            while(prev>0 && numbers[prev-1]>numbers[prev]){
                int temp = numbers[prev-1];
                numbers[prev-1]=numbers[prev];
                numbers[prev]=temp;
                prev--;
            }
        }
        System.out.println("The Sorted Array Is : \n");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter The Size Of an Array : ");
            int n = sc.nextInt();
            int numbers[] = new int[n];
            System.out.println("Enter The Elements Of Your Array : ");
            for(int i=0;i<n;i++){
                numbers[i]=sc.nextInt();
            }
            System.out.println("The Normal Entered Array Is: ");
            for(int i=0;i<n;i++){
                System.out.print(numbers[i]);
            }
            sort(numbers);
        }
    
    }
    
}
