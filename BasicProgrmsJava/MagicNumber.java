public class MagicNumber {
    public static void main(String args[]){
        int count =0;

        for(int i =1;i<=1000;i++){
        int num = 82;
        int sum = 0;
        

        while(num>9){
           
        while(num>0){
            int ld = num%10;
            sum= sum+ld;
            num = num/10;
        }
        num=sum;
        sum=0;
    }
    if(num==1){
        count++;
    }
}
System.out.println(count);
    
      
    }
}
