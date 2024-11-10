public class StrongNumber {
    public static void main(String args[]){
        int num = 146;
        int temp = num;
        int sum=0;
        while(num>0){
            
            int product =1;
            int ld = num%10;
            for(int i =1;i<=ld;i++){
               product = product *i;
            }
            num= num/10;
            sum = sum+product;
        }
        if(sum==temp){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong number");
        }
    }
}
