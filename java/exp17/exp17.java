import java.util.*;
class primeNumbersException extends Exception{
    primeNumbersException(String m){
        super(m);
    }
}

public class exp17{
    public static void validate(int no) throws primeNumbersException{
        int c=0;
        int i = no;
            for(int j = 2 ;j<no;j++){
                if(i%j==0){
                    c++;
                }
            }
        if(c!=0){
            throw new primeNumbersException("Enter prime Number:");
        }
        else{
            System.out.println("Square of the numbers is:"+no*no);
        }
        
    }
    
    public static void main(String args[]){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Prime Numbers:");
        num = in.nextInt();
        try{
            validate(num);
        }
        catch(primeNumbersException s){
            System.out.println(s);
        }
    }
}