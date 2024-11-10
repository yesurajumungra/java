
import java.util.Scanner;
public class DigitsInNumber {
    public  static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        int  lastDigit;


        while(number>0){
           lastDigit= number%10;
           System.out.println(lastDigit);

           number = number/10;
        }
    }
}
