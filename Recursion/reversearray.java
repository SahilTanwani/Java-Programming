package Recursion;
public class reversearray {
    public static void f(int i,int n,int arr1[]){
        if(i>=n){
            for(i=0;i<=4;i++){
                System.out.print(arr1[i]);
            }
        }else{
            int temp = arr1[i];
            arr1[i]=arr1[n];
            arr1[n]=temp;
            f(i+1,n-1,arr1);
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        f(0,5-1,arr1);
    }
}
