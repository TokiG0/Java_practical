import java.util.*;

class complex{
    double r,i;
    complex(){
        r=0.00;
        i=0.00;
    }
    complex(double r,double i){
        this.r = r;
        this.i = i;
    }
    
    void sum(complex A , complex B){
        System.out.println("Sum of Your Complex Number "+(A.r+B.r)+"+"+(A.i+B.i)+"i");
    }
}

public class exp5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first complex number:");
        double r1 = in.nextDouble();
        double i1 = in.nextDouble();
        complex A = new complex(r1,i1);
        System.out.println("Enter your Second complex number:");
        double r2 = in.nextDouble();
        double i2 = in.nextDouble();
        complex B = new complex(r2,i2);
        complex C = new complex();
        C.sum(A,B);
    }
}