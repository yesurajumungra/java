//import java.util.Scanner;
public class SpyNumberOrNot {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
           int num =1000;
      for(int i =1;i<=num;i++){
        int number = i;
        
        int lastDigit;
        int sum=0;
        int product =1;

        while(number>0){
            lastDigit= number%10;
            sum= sum+lastDigit;
            product = product*lastDigit;

            number = number/10;
        }

        if(sum ==product){
            System.out.println(i);
        }
        
    }
    }
}
