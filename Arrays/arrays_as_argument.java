package Arrays;

public class arrays_as_argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
            System.out.println(marks[i]);
        }
    }
    public static void main(String args[]){
        int marks[]={97,99,89,78,68};
        update(marks);
    }
    
}
