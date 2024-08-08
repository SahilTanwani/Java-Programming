package Arrays;

public class maxSubArraysss {
    public static void maxSub_Arrayss(int numbers[]){
        int sum;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]);
                    sum = sum + numbers[k];
                    if(sum>max){
                        max = sum;
                    }
                }
                System.out.print(" Sum Is "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The Maximum Of The Sub Array Will Be "+max);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxSub_Arrayss(numbers);
    }
    
}
