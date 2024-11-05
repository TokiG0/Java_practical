
public class exp2{
    public static void main(String args[]){
        System.out.println("The prime numbers between 1 to 1000 is:");
        int i , j, c;
        for(i=2; i<=1000;i++){
            c=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(i);
            }
            
        }
    }
}