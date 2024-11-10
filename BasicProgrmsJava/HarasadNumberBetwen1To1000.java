
public class HarasadNumberBetwen1To1000 {
    public static void main(String args[]){
        
        for(int i =1; i<=1000 ; i++){
            int num =i;
            int temp = num;
        int sum =0;
        while(num>0){
            int ld = num%10;
            sum = sum+ld;
            num = num/10;
        }
        if(temp%sum == 0){
            System.out.println(temp);
        }
    }
}
}
