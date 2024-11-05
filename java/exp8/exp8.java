import java.util.*;
class radius{
    int rad;
    Scanner in = new Scanner(System.in);
    void input(){
        System.out.println("Enter your Radius");
        rad = in.nextInt();
    }
}

class circle extends radius{
    void areacal(){
        double result = 2*3.14*rad*rad;
        System.out.println("Area of circle:"+result);
    }
}

class sphere extends circle{
    void vol(){
        double result1= (4/3*3.14*rad*rad*rad);
        System.out.println("Area of sphere:"+result1);
    }
}


public class exp8{
    public static void main(String args[]){
        sphere obj = new sphere();
        obj.input();
        obj.areacal();
        obj.vol();
    }
}