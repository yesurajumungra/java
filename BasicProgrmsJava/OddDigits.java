import java.util.Scanner;
public class OddDigits {
    public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
                 System.out.println("enter the number:");
            int number = scan.nextInt();
            int lastDigit;
            while(number>0){
               lastDigit = number %10;
               if(lastDigit%2 != 0){
                System.out.println("odd no " +lastDigit);
               }
               number = number/10;
            }

    }
}
