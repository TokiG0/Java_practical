import java.util.*;

public class exp1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int marks;
        System.out.println("Enter your Marks:");
        marks = in.nextInt();
        int a = marks/10;
        switch(a){
            case 0:
                System.out.println("Fail");
                break;
            case 1:
                System.out.println("Fail");
                break;
            case 2:
                System.out.println("Fail");
                break;
            case 3:
                System.out.println("Fail");
                break;
            case 4:
                System.out.println("PASS");
                break;
            case 5:
                System.out.println("Second Class");
                break;
            case 6:
                System.out.println("First Class");
                break;
            case 7:
                System.out.println("Distinction");
                break;
            case 8:
                System.out.println("Distinction");
                break;
            case 9:
                System.out.println("Distinction");
                break;
            case 10:
                System.out.println("Distinction");
                break;
        }
    }
}