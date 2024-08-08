package Arrays;

public class pairs_in_array {
    public static void pass(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int j=i-1;
            int k=1;
            while(k<=numbers.length-1-j){
                System.out.println("("+numbers[j]+" "+numbers[j+k]+")");
                k++;
            }
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pass(numbers);
    }
    
}
