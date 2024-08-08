package Strings;

public class shortestpath {
    public static void getshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'N'){
                y+=1;
            }
            else if(path.charAt(i) == 'S'){
                y-=1;
            }
            else if(path.charAt(i) == 'E'){
                x+=1;
            }
            else if(path.charAt(i) == 'W'){
                x-=1;
            } 
        }
        double dist = (Math.sqrt(((x)*(x))+((y)*(y))));
        System.out.println("The Shortest Distance Is "+dist);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        getshortestpath(path);
    }
}
