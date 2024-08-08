package Sorting;

import java.util.*;
public class Bubblesort {
    public static void sort(int numbers[],int m){
        for(int i=0;i<=numbers.length-2;i++){
            for(int j=0;j<=numbers.length-2-i;j++){
                if(numbers[j]>numbers[j+1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
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
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            int m=max;
            System.out.println("\nThe Max No Of this array is "+m);
            sort(numbers,m);
        }
    }    
}
