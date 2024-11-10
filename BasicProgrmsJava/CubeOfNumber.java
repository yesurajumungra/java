import java.math.*;
public class CubeOfNumber {

    public static void main(String [] args){
       int base = 2;
       int power = 4;
       int multi=1;

       for(int i = 1; i <= power;i++){
        multi = multi*base;
            
       }
       System.out.println(multi);
    }
    
}
