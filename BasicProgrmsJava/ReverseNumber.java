import java.util.*;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int rev=0;
        while(num>0){
            int ld= num%10;
            rev= rev*10 +ld;
            num = num/10;
        }
        System.out.println(rev);
    }
}
