public class MeanDigits {
    public static void main(String [] args){
        int num= 56789;
        int sum =0;
        int lastDigit;
             num = num/10;
        while(num>10){

          
            lastDigit=num%10;
            sum= sum+lastDigit;
            num= num/10;
        

        
        }
        System.out.println(sum);
    }
}
