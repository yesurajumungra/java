import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");

        int number = scan.nextInt();
        int lastDigit;
        int sum =0 ;

        while(number >0){
            lastDigit = number%10;
         sum = sum+lastDigit;
            number= number/10;
        }
         System.out.println(sum);
    }
}
