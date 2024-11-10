public class SumOfPrimeDigits {
    public static void main(String[] args) {
        int num= 359;
        int sum =0;
        while(num>0){
            int ld = num%10;
            int count =0;
            
            for(int i =1;i<=num;i++){
                if(ld%i==0){
                    count++;
                }
            }
            if(count==2){
                sum= sum+ld;
            }
            num = num/10;

        }
        System.out.println(sum);
    }
}
