import java.util.*;
public class DescendingOrderInANumberDigits {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number you want in desecnding order");
        int original = scan.nextInt();

        int ref=0;

        for(int i =9;i>=0;i--){
        int num =original;
        while(num>0){
            int ld = num%10;
            if(ld==i){
                ref= ref*10+ld;
                break;
            }
            num= num/10;
        }
    }
    System.out.println(ref);
    }
}
