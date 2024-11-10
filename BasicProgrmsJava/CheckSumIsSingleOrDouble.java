public class CheckSumIsSingleOrDouble {
    public static void main(String [] args){
        int num =234;
        int sum =0;
        while(num>0){
          int ld = num%10;
          sum=sum+ld;
          num=num/10;
        }

        if(sum<10){
            System.out.println("sum is single digit");
        }
        else{
            System.out.println("sum is not an single digit");
        }
    }
}
