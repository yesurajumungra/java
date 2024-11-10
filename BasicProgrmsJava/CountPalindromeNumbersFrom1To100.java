public class CountPalindromeNumbersFrom1To100 {
    public static void main(String args[]){
        
        int count=0;
        for(int i =1;i<=20;i++){
            int num=i;
            int rev =0;
            while(num>0){

                int ld = num%10;
                rev= rev*10+ld;  
               num=num/10;

            }
            if(rev == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total "+count);
    }
}
