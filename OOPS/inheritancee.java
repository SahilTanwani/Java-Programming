package OOPS;

public class inheritancee {
    public static void main(String args[]){
        Fish tuna = new Fish();
        tuna.eat();
    }
}
class Animal {
    void eat(){
        System.out.println("Eats");
    }
    void run(){
        System.out.println("Runs");
    }
}
class Fish extends Animal{
    int fins;
}
