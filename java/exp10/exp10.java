import java.util.*;

class oddException extends Exception{
    oddException(String s){
        super(s);
    }
}

public class exp10{
    public static void validate(int no) throws oddException{
        if(no%2!=0 &&){
            throw new oddException("Enter A even Number: ");
        }
        else{
            System.out.println("Square of No="+no*no);
        }
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        try{
            validate(no);
        }
        catch(oddException m){
            System.out.println(m);
            
        }
    }
}

