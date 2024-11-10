import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum =0;
        int temp = number;

        for(int i=1 ; i<number;i++){
            if(number%i ==0){
                System.out.println(i);
                sum = sum+i;
            }
        }
        if(sum == temp ){
            System.out.println(temp+" is an perfect number");
        }else{
            System.out.println(temp +" is  not an perfect number");
        }
    }
}