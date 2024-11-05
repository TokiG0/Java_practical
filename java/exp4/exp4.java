import java.util.*;

class Area{
    void Area1(int side){
        System.out.println("Area of square = "+(side*side));
    }
    void Area1(int si,int h){
        System.out.println("Area of triangle = "+(0.5*si*h));
    }
}


public class exp4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Side for square:");
        int side = in.nextInt();
        System.out.println("Enter your base for triangle:");
        int base = in.nextInt();
        System.out.println("Enter your height for triangle:");
        int height = in.nextInt();
        Area obj = new Area();
        obj.Area1(side);
        obj.Area1(base,height);
    }
}