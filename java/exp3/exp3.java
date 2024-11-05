import java.util.*;

class Area{
    int s,b,w;
    void rec(int b,int w){
        System.out.println("Area of rectangle is"+(b*w));
    }
    void sqr(int s){
        System.out.println("Area of Square is="+(s*s));
    }
}

public class exp3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your breadth and width:");
        int br = in.nextInt();
        int wd = in.nextInt();
        System.out.println("Enter your side:");
        int side = in.nextInt();
        Area obj = new Area();
        obj.rec(br,wd);
        obj.sqr(side);
    }
}