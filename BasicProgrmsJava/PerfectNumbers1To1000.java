
public class PerfectNumbers1To1000{
    public static void main(String[] args){
       int count=0;
       for(int k = 1; k<=1000;k++){
        int num = k;
        int sum = 0;

            for(int i = 1; i< num;i++){
                if(num%i== 0){
                   
                    sum = sum +i;
                }

            }
            if(sum == num){
                      
                       count++;
            }
       }
       System.out.println(count);

    }
}