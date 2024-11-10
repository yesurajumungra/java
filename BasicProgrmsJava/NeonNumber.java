
import java.util.*;
public class NeonNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();

        int square = num*num;
        int sum =0;

        while(square>0){
            int ld = square%10;
            sum = sum+ld;
            square= square/10;
        }
        if(sum==num){
            System.out.println(num+" is an neon number");
        }
        else{
            System.out.println(num+" is  not an  neon number");
        }
    }
    
}
