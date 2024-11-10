
import java.util.*;
public class TwistedPrimeNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int original =num;
        int count=0;

        for(int i =1;i<=num;i++){
            if(num%i ==0){
                count++;
            }
        }
        if(count==2){
            int rev=0;
            int count1=0;
            while(num>0){
                int ld = num%10;
                rev= rev*10+ld;
                num = num/10;
            }
            for(int j =1;j<=rev;j++){
                if(rev%j==0){
                    count1++;
                }
            }
            if(count1==2){
                System.out.println(original+" is an twisted prime number");
            }
            else{
                System.out.println(original+" not an twisted prime number");
            }
            
        }else{
            System.out.println(original+" is not an prime number");
        }
    }
    
}
