package OOPS;

public class constructorr {
    public static void main(String args[]){
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("Sahil");
        System.out.println(s2.name);
        Student s3 = new Student(58);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(){ // Non Parameterized Constructer
        System.out.println("Constructer Is Called...");
    }
    Student(String name){ // Parameterized Constructor
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
