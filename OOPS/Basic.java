package OOPS;

public class Basic {
    public static void main(String args[]){
        Pen p1 = new Pen(); // Object Created
        p1.setColor("green");
        p1.setTip(5);
        System.out.println("Color Is : "+p1.color+" \n Tip Is : "+ p1.tip);
    }
    
}
class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
