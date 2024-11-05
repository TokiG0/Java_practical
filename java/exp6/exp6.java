import java.util.*;

class addition{
    void add(int a[][],int b[][]){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println(a[i][j]+b[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
    }
}

public class exp6{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your First Matrix");
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                a[i][j]=in.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println("Enter your second Matrix");
         for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                b[i][j]=in.nextInt();
            }
            System.out.println("\n");
        }
        addition obj = new addition();
        obj.add(a,b);
        
    }
}

