//import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]){
       // Scanner scan = new Scanner(System.in);
       for(int k =1;k<=1000;k++){
        int num = k;

        int temp = num;
        int original = num;
        int count=0;

        while(num>0){
            num= num/10;
            count++;
        }
        int power = count;
        int sum=0;
        while(temp>0){
            int ld = temp%10;
            int exp=1;
            for(int i = 1;i<=power;i++){
            exp = exp*ld;
            }
            temp = temp/10;
            sum = sum+exp;

        }
        if(sum == original){
            System.out.println(original+ " is an arm strong number");
        }
        // else{
        //     System.out.println(original+" is  not an arm strong number");
        // }
    }
    }
}
