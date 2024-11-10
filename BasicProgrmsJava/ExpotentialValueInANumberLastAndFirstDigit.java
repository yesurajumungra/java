import java.util.*;
public class ExpotentialValueInANumberLastAndFirstDigit {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ld = num%10;
        int count=0;
    

        while(num>10){
            num = num/10;
             count++;
        }
        int firstDigit=num;

        int base = ld;
        int power= count+1;
        int exp =1;

        for(int i =1;i<=power;i++){
            exp = exp*base;
        }
        System.out.println(exp);

    }
}
