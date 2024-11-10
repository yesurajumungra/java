public class FactorialValueOfFirstDigitInGivenNumber {
    public static void main(String[] args){
        int num = 1;
        int product =1;
        while(!(num<=10)){
            int ld = num%10;
            num = num/10;

        }
        for(int i =1;i<=num;i++){
            product = product *i;

        }
        System.out.println(product);
    }
}
