
import java.util.Scanner;
public class XylemOrPholem {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            
           int sum1 = 0;
           int sum2=0;
           int lastDigit = num%10;
           sum1= sum1+lastDigit;
           num = num/10;
           while(num>9){

            lastDigit = num%10;
            sum2 = sum2 +lastDigit;
            num = num/10;
           }
           sum1 = sum1+num;
           if(sum1 == sum2){
            System.out.println("it is an xylem number");
           }
           else{
            System.out.println("it is an pholem number");
           }
            
    }
}
