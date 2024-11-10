import java.util.Scanner;
public class LargestDigitInANumber {
    public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
                 System.out.println("enter the number:");
            int number = scan.nextInt();
            int largestDigit=0;
            int lastDigit;
            while(number>0){
              
                lastDigit = number%10;
                
                if(lastDigit>largestDigit){
                    largestDigit=lastDigit;
                }

               number = number/10;
            }
            System.out.println(largestDigit);

    }
}
