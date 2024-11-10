import java.util.Scanner;
public class DuckNumber {
    public static void main(String args[]){

    Scanner scan  = new Scanner(System.in) ;
        int number = scan.nextInt();
        boolean duckNumber = false;
        int lastDigit;

        while(number>0){
            lastDigit =number%10;
            if(lastDigit==0){
               duckNumber= true;
                break;
            }
            
            number= number/10;
        }
        if(duckNumber==true){
            System.out.println("it is an duck number");
        }
        else{
            System.out.println("it is not an  duck number");
        }

    }
}
