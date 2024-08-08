package Arrays;

public class Subarray {
    public static void sub_array(int numbers[]){
        int sum;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]);
                    sum = sum + numbers[k];
                }
                System.out.print(" Sum Is "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        sub_array(numbers);

    }
    
}
