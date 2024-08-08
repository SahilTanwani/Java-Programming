package Sorting;

import java.util.*;
public class Selectionsort {
    public static void sort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<numbers.length;j++){
            if(numbers[minPos]>numbers[j]){
               minPos=j;
            }
        //swap
        int temp = numbers[minPos];
        numbers[minPos]=numbers[i];
        numbers[i]=temp;
        }
    }
        System.out.println("The Sorted Array Is : \n");
        for(int k=0;k<numbers.length;k++){
            System.out.print(numbers[k]);
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
