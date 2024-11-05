import java.util.*;

 class student{
    void rollno(){
        int rollNo ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your roll Number");
        rollNo = in.nextInt();

    }
}

class sem extends student{
    static double sem1,sem2;
    void semMarks(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your sem1 and sem2 marks:");
        sem1 = in.nextDouble();
        sem2 = in.nextDouble();
    }
}


interface sports{
    double spoMrk = 5.02;
}

class totalMarks extends sem implements sports{
    void printsports(){
        System.out.println("Your Sports marks is:" + spoMrk);
    }

    void finalmarks(){
        double result = (sem1+sem2)/2 + spoMrk;
        System.out.println("Your final marks is:"+result);
    }
}


public class exp9{
    public static void main(String args[]){
        totalMarks t = new totalMarks();
        t.rollno();
        t.semMarks();
        t.printsports();
        t.finalmarks();
    }
}