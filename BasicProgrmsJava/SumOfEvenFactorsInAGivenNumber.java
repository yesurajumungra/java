import java.util.Scanner;
public class SumOfEvenFactorsInAGivenNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        int sum = 0;

        for(int i = 1; i<num;i++){
            if(num%i ==0){
               if(i%2==0){
                       sum= sum +i;
               }
            }
        }  
        System.out.println(sum);     
    }
    
}
