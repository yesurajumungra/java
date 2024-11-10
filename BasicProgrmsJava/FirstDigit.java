import java.util.Scanner;
public class FirstDigit {
    public static void main(String [] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("enter your number:");
         int number= scan.nextInt();

         while(number>9){
            number = number/10;
         
         }
         System.out.println(number);
       

   
    
}}
