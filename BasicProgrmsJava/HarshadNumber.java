import java.util.Scanner;
public class HarshadNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        int temp = num;
        int sum =0;
        while(num>0){
            int ld= num%10;
            sum = sum +ld;
            num = num/10;
        }
        if(temp%sum == 0){
             System.out.println(temp+" it is an HarshadNumber");
        }
        else{
            System.out.println(temp+" it is not an HarshadNumber");
        }

    }
}
