import java.util.Scanner;
public class PrimeNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = scan.nextInt();
        int count =0;

        for(int i = 1; i<=number; i++){

            if (number % i== 0){
                count++;
            }

        }
        if(count == 2){
            System.out.println(number +"  is an prime number");
        }
        else{
            System.out.println(number +"  is not an  prime number");
        }


    }
}
