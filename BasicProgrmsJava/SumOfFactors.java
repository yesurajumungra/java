import java.util.Scanner;
public class SumOfFactors {
    public static void main(String [] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("enter your number:");
         int number= scan.nextInt();

         int sum=0;
         for(int i =1 ; i<=number; i++){
            if(number%i ==0){
               sum = sum+i;
            }
    }
    System.out.println(sum);
    }
}
