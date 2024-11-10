public class NeonNumbers1To1000 {
    public static void main(String args[]){
        for(int i =1;i<=100000;i++){
            int num =i;
            int square = num*num;
            int sum=0; 
            while(square>0){
                int ld = square%10;
                sum= sum+ld;
                square= square/10;
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
}
