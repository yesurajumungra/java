import java.util.*;
public class PalindromeInGivenRange {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("from");
        int from = scan.nextInt();
        System.out.println("upto");
        int upto = scan.nextInt();
        float sum =0F;
        


        for(int i =from; i<=upto;i++){
            int number =i;
            int rev=0;
           

            while(number>0){
                int ld =number %10;
                rev= rev*10+ld;
                number= number/10;
            }
            if(rev==i){
                System.out.println(i);
            }

        }
      

    


    }
}
