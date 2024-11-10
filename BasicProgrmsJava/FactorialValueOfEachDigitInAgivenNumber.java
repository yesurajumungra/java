public class FactorialValueOfEachDigitInAgivenNumber {
    public static void main(String [] args){
        int num =345;
      
        while(num>0){
            int    product =1;
            int ld = num%10;
            for(int i =1;i<=ld;i++){
                product = product *i;
            }
           
            System.out.println(product);
            num = num/10;
            
        }
    }
}
