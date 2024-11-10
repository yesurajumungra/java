import java.util.Scanner;
public class SamllestDigitInANumber {
    public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
                 System.out.println("enter the number:");
            int number = scan.nextInt();
            int smallest=10;
            int lastDigit=0;

            while(number>0){
                lastDigit = number%10;
                
                if(lastDigit < smallest){
                    smallest =lastDigit;
                }

               number = number/10;
            }
            System.out.println(smallest);

    }
}