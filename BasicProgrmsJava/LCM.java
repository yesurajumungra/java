public class LCM {
    public static void main(String args[]){
        int num1 =10;
        int num2= 20;
        int hcf;

        for(int i=1;i<=num1;i++){

        if(num1%i==0 && num2%i==0){
          hcf =i;
        }
        System.out.println(hcf);

        }
        
    }
}
