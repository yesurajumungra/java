public class SumOfFirstAndLastDigitIsPrimeOrNot {
    public static void main(String [] args){
        int num = 34521;
         int ld = num%10;

        while(num>10){
           num=num/10;
        }
        int sum = ld+num;
        
        for(int i = 1;i<=sum;i++){
            int  count =0;
            if(sum%i ==0){
                System.out.println(i);
                count++;
            }
            if(count == 2){
                System.out.println(" sum is an prime number");
            }

        }

    }
}
