import java.util.Scanner;
public class SumOfOddFactorsInGivenNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i<num;i++){
            if(num%i ==0){
               if(i%2 !=0){
                System.out.println(i);
                       sum = sum+i;
               }
            }
        }  
        System.out.print(sum);     
    }
    
}
